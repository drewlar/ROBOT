// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final double TIME_DRIVE =10.0;
    public static final double TIME_ROTATION =3.0;
    public static final double TIME_LIFT =3.0;
    public static final double TIME_SHOOTER =3.0;
    public static final double TIME_INTAKE =3.0;
    public static final double TIME_CONVEYOR =3.0;
    public static final double TIME_AUTONOMOUS =3.0;


    public static final double SPEED_DRIVE =.5;
    public static final double SPEED_ROTATION=.5;
    public static final double SPEED_LIFT=.5;
    public static final double SPEED_SHOOTER=.5;
    public static final double SPEED_INTAKE=.5;
    public static final double SPEED_CONVEYOR=.5;

    public static final double AUTONOMOUS_SPEED_DRIVE=.5;
    public static final double AUTONOMOUS_SPEED_ROTATION=.5;
    public static final double AUTONOMOUS_SPEED_LIFT=.5;
    public static final double AUTONOMOUS_SPEED_SHOOTER=.5;
    public static final double AUTONOMOUS_SPEED_INTAKE=.5;
    public static final double AUTONOMOUS_SPEED_CONVEYOR=.5;

    public static final int AXIS_INTAKE = Constants.XBOX_LEFT_TRIGGER_AXIS;
    public static final int AXIS_CONVEYOR = Constants.XBOX_LEFT_TRIGGER_AXIS;
    public static final int AXIS_SHOOTER = Constants.XBOX_RIGHT_TRIGGER_AXIS;
    public static final int AXIS_LIFT = Constants.XBOX_RIGHT_X_AXIS;
    public static final int AXIS_ROTATE = Constants.XBOX_RIGHT_Y_AXIS;
    public static final int AXIS_FORWARD= Constants.XBOX_LEFT_Y_AXIS;
    public static final int AXIS_TURN = Constants.XBOX_LEFT_X_AXIS;

    public static final int MOTOR_LEFT = 0;
    public static final int ROTATE = 1;
    public static final int MOTOR_RIGHT =2;
    public static final int ROTATE_1 =3;
    public static final int LIFT =4;
    public static final int LIFT_1 =5;
    public static final int SHOOTER =6;
    public static final int SHOOTER_1 =7;
    public static final int INTAKE =8;
    public static final int CONVEYOR =9;

    public static final int XBOX_LEFT_X_AXIS =0;
    public static final int XBOX_LEFT_Y_AXIS =1;
    public static final int XBOX_LEFT_TRIGGER_AXIS=2;
    public static final int XBOX_RIGHT_TRIGGER_AXIS=3;
    public static final int XBOX_RIGHT_X_AXIS =4;
    public static final int XBOX_RIGHT_Y_AXIS=5;

    public static final int XBOX_BUTTON_A =1;
    public static final int XBOX_BUTTON_B=2;
    public static final int XBOX_BUTTON_X=3;
    public static final int XBOX_BUTTON_Y=4;
    public static final int XBOX_BUTTON_LEFT_TRIGGER=5;
    public static final int XBOX_BUTTON_RIGHT_TRIGGER=6;
    public static final int XBOX_BUTTON_LEFT_HOME=7;
    public static final int XBOX_BUTTON_RIGHT_HOME=8;
    public static final int XBOX_BUTTON_LEFT_JOYSTICK=9;
    public static final int XBOX_BUTTON_RIGHT_JOYSTICK=10;

    public static final int XBOX_POV=0;
    public static final int XBOX_CONTROLLER=0;

    public static final int CAMERA_RES_X = 320;
	public static final int CAMERA_RES_Y = 240;


}
