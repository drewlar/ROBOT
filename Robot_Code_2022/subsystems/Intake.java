// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

  Spark intake;
  /** Creates a new Intake. */
  public Intake() {

    intake = new Spark(Constants.INTAKE);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void intakeWithTrigger(XboxController cnt,double speed){
    intake.set(cnt.getRawAxis(Constants.AXIS_INTAKE)*speed);
  }
  public void intakeWithButton(double speed){
    intake.set(speed);
  }
  public void stop(){
    intake.set(0);
  }
}
