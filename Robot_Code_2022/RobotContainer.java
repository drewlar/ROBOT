// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveForwardTimed;
import frc.robot.commands.DriveWithJoysticks;
import frc.robot.commands.IntakeWithButton;
import frc.robot.commands.IntakeWithTrigger;
import frc.robot.commands.LiftDownWithController;
import frc.robot.commands.LiftUpWithController;
import frc.robot.commands.RotateWithJoystick;
import frc.robot.commands.ShootBall;
import frc.robot.commands.conveyWithAxis;
import frc.robot.commands.conveyWithButton;
import frc.robot.subsystems.Conveyor;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Lift;
import frc.robot.subsystems.Rotate;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */

public class RobotContainer {

  public static XboxController driverJoystick;


  private final DriveTrain driveTrain;
  private final DriveWithJoysticks driveWithJoysticks;
  private final DriveForwardTimed driveForwardTimed;

  private final Rotate rotate;
  private final RotateWithJoystick rotateWithJoystick;

  private final Lift lift;
  private final LiftDownWithController liftDownWithController;
  private final LiftUpWithController liftUpWithController;

  private final Shooter shooter;
  private final ShootBall shootBall;

  private final Intake intake;
  private final IntakeWithButton intakeWithButton;

  private final Conveyor conveyor;
  private final conveyWithButton conveyWithButton;

  //private final IntakeWithTrigger intakeWithTrigger;

  private final conveyWithAxis conveyWithAxis;
  
  
  




  // The robot's subsystems and commands are defined here...
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    driverJoystick = new XboxController(Constants.XBOX_CONTROLLER);

    driveTrain = new DriveTrain();
    driveWithJoysticks = new DriveWithJoysticks(driveTrain);
    driveWithJoysticks.addRequirements(driveTrain);
    driveTrain.setDefaultCommand(driveWithJoysticks);
   

    driveForwardTimed = new DriveForwardTimed(driveTrain);
    driveForwardTimed.addRequirements(driveTrain);

    rotate = new Rotate();
    rotateWithJoystick = new RotateWithJoystick(rotate);
    rotateWithJoystick.addRequirements(rotate);
    rotate.setDefaultCommand(rotateWithJoystick);

    lift = new Lift();
    liftDownWithController = new LiftDownWithController(lift);
    liftDownWithController.addRequirements(lift);
    liftUpWithController = new LiftUpWithController(lift);
    liftUpWithController.addRequirements(lift);

    shooter = new Shooter();
    shootBall = new ShootBall(shooter);
    shootBall.addRequirements(shooter);
    shooter.setDefaultCommand(shootBall);

    intake = new Intake();
    intakeWithButton = new IntakeWithButton(intake);
    intakeWithButton.addRequirements(intake);

    //intakeWithTrigger = new IntakeWithTrigger(intake);
    //intakeWithTrigger.addRequirements(intake);

    conveyor = new Conveyor();
    conveyWithButton= new conveyWithButton(conveyor);
    conveyWithButton.addRequirements(conveyor);

    conveyWithAxis = new conveyWithAxis(conveyor);
    conveyor.setDefaultCommand(conveyWithAxis);



  

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    
    JoystickButton aButton = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_A);
    JoystickButton bButton = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_B);
    JoystickButton xButton = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_X);
    JoystickButton yButton = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_Y);

    JoystickButton leftBumper = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_LEFT_TRIGGER);
    JoystickButton rightBumper= new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_RIGHT_TRIGGER);

    JoystickButton homeLeftButton = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_LEFT_HOME);
    JoystickButton homeRighButton = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_RIGHT_HOME);

    JoystickButton leftStickButton = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_LEFT_JOYSTICK);
    JoystickButton rightStickButton = new JoystickButton(driverJoystick, Constants.XBOX_BUTTON_RIGHT_JOYSTICK);


    yButton.whenHeld(new LiftUpWithController(lift));
    aButton.whenHeld(new LiftDownWithController(lift));
    leftBumper.whenHeld(new IntakeWithButton(intake));



  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
     //An ExampleCommand will run in autonomous
    return driveForwardTimed;
  }
}
