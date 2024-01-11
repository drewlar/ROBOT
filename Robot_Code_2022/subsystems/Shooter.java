// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {

  Spark shooter;
  Spark shooter1;

  SpeedControllerGroup shooters;
  /** Creates a new Shooter. */
  public Shooter() {

    shooter = new Spark(Constants.SHOOTER);
    shooter1 = new Spark(Constants.SHOOTER_1);

    shooters = new SpeedControllerGroup(shooter, shooter1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void shootBall(XboxController cnt,double speed){
    shooters.set(cnt.getRawAxis(Constants.AXIS_SHOOTER)*speed);  
  }
  public void stop(){
    shooters.set(0);
  }

}
