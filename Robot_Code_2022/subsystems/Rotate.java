// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Rotate extends SubsystemBase {

  Spark rotate;
  Spark rotate1;

  SpeedControllerGroup allrotate;

  /** Creates a new Rotate. */
  public Rotate() {
    rotate = new Spark(Constants.ROTATE);
    rotate1 = new Spark(Constants.ROTATE_1);
  
    allrotate = new SpeedControllerGroup(rotate, rotate1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void rotateWithJoystick(XboxController cnt, double speed){
    double finalspeed =cnt.getRawAxis(Constants.AXIS_ROTATE)*speed*-1;
    allrotate.set(finalspeed);
  }
  public void stop(){
    allrotate.set(0);
  }
}
