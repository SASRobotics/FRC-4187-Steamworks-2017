package org.usfirst.frc.team4817.robot.subsystems;

import org.usfirst.frc.team4817.robot.RobotMap;
import org.usfirst.frc.team4817.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.RobotDrive; 
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;


public class Drive extends Subsystem {
	RobotDrive drive;
	
	Talon leftMotor;
	Spark rightMotor;
	
	public Drive(){
		super("Drive");
		
		leftMotor = new Talon(RobotMap.driveLeftMotor);
		rightMotor = new Spark(RobotMap.driveRightMotor);
		drive = new RobotDrive(leftMotor, rightMotor);
	}
	
	public void tankDrive(double left, double right){
		drive.tankDrive(left,right);
	}
	
	public void driveStraight(double speed){
		drive.tankDrive(speed,speed);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickDrive());
    }
}

