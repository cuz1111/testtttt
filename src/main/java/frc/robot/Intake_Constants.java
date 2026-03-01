// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.CANBus;
import com.ctre.phoenix6.configs.MotionMagicConfigs;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.Slot1Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.signals.StaticFeedforwardSignValue;

/** Add your docs here. */
public class Intake_Constants {

    public static final CANBus Can = new CANBus("888");

    public static class  Intake_Neo_Roller {
        public static final int Roller_ID = 1;

        public static double Roller_Start = 10;//目前為dutycycle，記得改
        
        public static final double Roller_Start_P = 0.1;
        public static final double Roller_Start_I = 0;
        public static final double Roller_Start_D = 0.001;
        public static final double Roller_Start_F = 0;



        public static final double maxAcceleration = 5;
        public static final double cruiseVelocity = 4 ;

      
    }


    public static class  Intake_Kraken_Roller {
        public static final int Roller_ID = 11;

        public static final TalonFXConfiguration rollerConfiguration = new TalonFXConfiguration()
        .withMotionMagic(new MotionMagicConfigs().withMotionMagicAcceleration(2500).withMotionMagicCruiseVelocity(600).withMotionMagicJerk(30))
        .withSlot0(new Slot0Configs().withKP(0.2).withKI(0.05).withKD(0)
        .withKS(0.2).withKV(0.24).withKA(0).withStaticFeedforwardSign(StaticFeedforwardSignValue.UseClosedLoopSign));


        public static double Roller_Start = -25;
        


    }


    public static class  Intake_Neo_Deploy {
        public static final int Deploy_ID = 2;

        public static double Deploy_Forward = 10;//目前為dutycycle，記得改
        public static double Deploy_Back = -10;
        
        public static final double Deploy_Forward_P = 0.1;
        public static final double Deploy_Forward_I = 0;
        public static final double Deploy_Forward_D = 0.001;
        public static final double Deploy_Forward_F = 0;
 
        
        public static final double Deploy_Back_P = 0.1;
        public static final double Deploy_Back_I = 0;
        public static final double Deploy_Back_D = 0.001;
        public static final double Deploy_Back_F = 0;


        public static final double maxAcceleration = 5;
        public static final double cruiseVelocity = 2 ;
    }


    public static class  Intake_Kraken_Deploy {
        public static final int Deploy_ID = 0;

        public static double Deploy_Start = -6.2;
        public static double Deploy_Back = 6.2;

        public static final TalonFXConfiguration deployOutConfiguration = new TalonFXConfiguration()
        .withSlot0(new Slot0Configs() .withKP(0.2).withKI(0).withKD(0).withKS(0.3).withKV(0.2).withKA(0.1)
        .withStaticFeedforwardSign(StaticFeedforwardSignValue.UseClosedLoopSign))
        .withMotionMagic(new MotionMagicConfigs().withMotionMagicAcceleration(40).withMotionMagicCruiseVelocity(60)
        .withMotionMagicJerk(600));

        public static final TalonFXConfiguration deployBackConfiguration = new TalonFXConfiguration()
        .withSlot0(new Slot0Configs() .withKP(0.2).withKI(0).withKD(0).withKS(0.3).withKV(0.13).withKA(0.15)
        .withStaticFeedforwardSign(StaticFeedforwardSignValue.UseClosedLoopSign))
        .withMotionMagic(new MotionMagicConfigs().withMotionMagicAcceleration(40).withMotionMagicCruiseVelocity(90)
        .withMotionMagicJerk(600));
    }

 
}
