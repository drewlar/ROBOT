// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Lift extends SubsystemBase {

  Spark lift;
  Spark lift1;

  SpeedControllerGroup lifts;

  /** Creates a new Lift. */
  public Lift() {

    lift=new Spark(Constants.LIFT);
    lift1=new Spark(Constants.LIFT_1);
    lifts = new SpeedControllerGroup(lift, lift1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void liftWithButton(double speed){
    lifts.set(speed);
  }
  public void decendWithButton(double speed){
    lifts.set(speed*-1);
  }
  public void stop(){
    lifts.set(0);
  }

}
