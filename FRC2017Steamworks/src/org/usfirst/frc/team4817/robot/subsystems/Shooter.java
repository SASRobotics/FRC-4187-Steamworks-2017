package org.usfirst.frc.team4817.robot.subsystems;
import org.usfirst.frc.team4817.robot.RobotMap;

//import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	
	Talon shooter;
	
	public Shooter(){
		super ("Shooter"); 
		shooter= new Talon(RobotMap.shooterMotor);
	}
	
	public void shooterForward() {
//		shooter.set(Relay.Value.kOn);					
		shooter.set(100);		
	}
	
	public void shooterBackward() {
//		shooter.set(Relay.Value.kOn);
		shooter.set(-100);
	}
	
	public void shooterOff() {
    	shooter.set(0);
	}
		
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

