package org.usfirst.frc.team4817.robot.commands;
import org.usfirst.frc.team4817.robot.Robot; 
import edu.wpi.first.wpilibj.command.Command;
//import org.usfirst.frc.team4817.robot.subsystems.Shooter;

/**
 *
 */
public class ShooterCommand extends Command {
	public int direction;

    public ShooterCommand(int x) {
        
    	// Use requires() here to declare subsystem dependencies
         requires(Robot.shooter);
         
         direction = x;
         
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if(direction == 1) {
    		Robot.shooter.shooterForward();
    	} 
    	else if (direction == 2) {
    		Robot.shooter.shooterBackward();
    	} 
    	else {
    		Robot.shooter.shooterOff();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
