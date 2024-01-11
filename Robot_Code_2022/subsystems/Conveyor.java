// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Conveyor extends SubsystemBase {

  Spark conveyor;
  /** Creates a new Conveyor. */
  public Conveyor() {
    conveyor = new Spark(Constants.CONVEYOR);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void conveyWithTrigger(XboxController cnt,double speed){
    conveyor.set(cnt.getRawAxis(Constants.AXIS_CONVEYOR)*speed);
  }
  public void conveyWithButton(double speed){
    conveyor.set(speed);
  }
  public void stop(){
    conveyor.set(0);
  }
}
