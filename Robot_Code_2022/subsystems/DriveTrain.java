// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class DriveTrain extends SubsystemBase {

  private Spark leftMotor;
  private Spark rightMotor;
  SpeedControllerGroup leftmotors;
  SpeedControllerGroup rightmotors;
  DifferentialDrive drive;

  /** Creates a new DriveTrain. */
  public DriveTrain() {

    leftMotor= new Spark(Constants.MOTOR_LEFT);
    leftMotor.setInverted(true);

    rightMotor = new Spark(Constants.MOTOR_RIGHT);
    rightMotor.setInverted(false);

    leftmotors = new SpeedControllerGroup(leftMotor);
    rightmotors = new SpeedControllerGroup(rightMotor);

    drive = new DifferentialDrive(leftmotors, rightmotors);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveWithJoysticks(XboxController cnt, double speed){
    
    double xSpeed = cnt.getRawAxis(Constants.AXIS_FORWARD)*speed;
    double zRotation = cnt.getRawAxis(Constants.AXIS_TURN)*-speed;
    drive.arcadeDrive(xSpeed, zRotation);
  }
  
  public void driveFoward(double speed){
    drive.tankDrive(speed, speed);

  }
  public void stop(){
    drive.stopMotor();
    
  }



}
