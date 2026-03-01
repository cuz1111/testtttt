// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.controls.MotionMagicDutyCycle;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.controls.VelocityVoltage;

public class Intake_Kraken_Kraken extends SubsystemBase {
  private final TalonFX m_roller = new TalonFX(Intake_Constants.Intake_Kraken_Roller.Roller_ID, Intake_Constants.Can);
  private final TalonFX m_deploy = new TalonFX(Intake_Constants.Intake_Kraken_Deploy.Deploy_ID, Intake_Constants.Can);
  private final MotionMagicVoltage deploy = new MotionMagicVoltage(0).withSlot(0);
  
  public Intake_Kraken_Kraken() {


    m_roller.getConfigurator().apply(Intake_Constants.Intake_Kraken_Roller.rollerConfiguration);
    

  }
  @Override 
  public void periodic() {
      SmartDashboard.putNumber("Current position", m_deploy.getPosition().getValueAsDouble());
      SmartDashboard.putNumber("Target position", deploy.Position);
  }

  public void rollerStart() {
    m_roller.setControl(new VelocityVoltage(Intake_Constants.Intake_Kraken_Roller.Roller_Start).withSlot(0));
  }

  public void rollerStop() {
    m_roller.stopMotor();
  }

  public void deployOut() {
    m_deploy.getConfigurator().apply(Intake_Constants.Intake_Kraken_Deploy.deployOutConfiguration);
    m_deploy.setControl(deploy.withPosition(Intake_Constants.Intake_Kraken_Deploy.Deploy_Start).withSlot(0));
  }

  public void deployBack() {
    m_deploy.getConfigurator().apply(Intake_Constants.Intake_Kraken_Deploy.deployBackConfiguration);
    m_deploy.setControl(deploy.withPosition(Intake_Constants.Intake_Kraken_Deploy.Deploy_Start).withSlot(0));
   ;
  }
  public void stop(){
    m_deploy.stopMotor();
  }
}
