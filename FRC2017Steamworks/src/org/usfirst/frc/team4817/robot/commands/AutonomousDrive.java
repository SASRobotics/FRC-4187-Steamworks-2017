package org.usfirst.frc.team4817.robot.commands;
import org.usfirst.frc.team4817.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutonomousDrive extends Command {
	
	char position; 
	
	boolean isFin = false;

    public AutonomousDrive(char c) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive); 
    	position = c;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
    
    public void driveStraight(long duration) {
    	long startTime = System.currentTimeMillis();
    	while((System.currentTimeMillis() - startTime) < duration) {
			Robot.drive.tankDrive(-.64, -.64);
		}
    }
    
    public void driveBack (long duration){
    	long startTime = System.currentTimeMillis(); 
     	while((System.currentTimeMillis() - startTime) < duration) {
			Robot.drive.tankDrive(.64 , .64);
		}
    }
    
    public void turnRight() {
    	long startTime = System.currentTimeMillis();
    	while((System.currentTimeMillis() - startTime) < 385) {
			Robot.drive.tankDrive(.64, -.64);
		}
    }
    
    public void turnLeft() {
    	long startTime = System.currentTimeMillis();
    	while((System.currentTimeMillis() - startTime) < 385) {
			Robot.drive.tankDrive(-.64, .64);
		}
    }
    
    public void turnBackRight() {
    	long startTime = System.currentTimeMillis();
    	while((System.currentTimeMillis() - startTime) < 250) {
			Robot.drive.tankDrive(.64, -.64);
		}
    }
    
    public void turnBackLeft() {
    	long startTime = System.currentTimeMillis();
    	while((System.currentTimeMillis() - startTime) < 250) {
			Robot.drive.tankDrive(-.64, .64);
		}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(position == 'm') {
    		driveStraight(2500);
    		isFin = true;
    	}
    	if(position == 'r') {
    		driveStraight(2160);
    		Timer.delay(.5);
    		turnLeft();
    		Timer.delay(.5);
    		driveStraight(1500);
    		Timer.delay(3);
    		driveBack(1500); 
    		Timer.delay(.5);
    		turnBackRight(); 
    		Timer.delay(.5);
    		driveStraight(3000); 
    		
    		isFin = true;
    	}
    	if(position == 'l') {
 
    		driveStraight(2260);
    		Timer.delay(.5);
    		turnRight();
    		Timer.delay(.5);
    		driveStraight(1500);
    		Timer.delay(3);
    		driveBack(1500); 
    		turnBackLeft(); 
    		driveStraight(3000); 
    			
    		isFin = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isFin;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
