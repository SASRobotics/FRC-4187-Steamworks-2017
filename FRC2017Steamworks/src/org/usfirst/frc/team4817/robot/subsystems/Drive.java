package org.usfirst.frc.team4817.robot.subsystems;

import org.usfirst.frc.team4817.robot.RobotMap;
import org.usfirst.frc.team4817.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.RobotDrive; 
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
	RobotDrive drive;
	
	public Drive(){
		super("Drive");
		drive = new RobotDrive(RobotMap.driveLeftMotor, RobotMap.driveRightMotor);
	}
	
	public void tankDrive(double left, double right){
		drive.tankDrive((left),(right));
	}
	
	public void driveStraight(double speed){
		drive.tankDrive(speed,speed);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickDrive());
    }

}