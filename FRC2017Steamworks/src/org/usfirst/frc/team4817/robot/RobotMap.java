package org.usfirst.frc.team4817.robot;

//import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	 public static final int driveLeftMotor = 0; //check that these are the right ports
	 public static final int driveRightMotor = 1; //sparks 
//	 public static SpeedController driveRightMotor;
	 public static final int shooterMotor= 5; // shooter motor 
	 public static void init(){
		// driveRightMotor= new Spark(1);
	 }

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
