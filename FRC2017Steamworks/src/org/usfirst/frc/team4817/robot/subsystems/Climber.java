package org.usfirst.frc.team4817.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4817.robot.RobotMap;

//import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX; 

/**
 *
 */
public class Climber extends Subsystem {
	TalonSRX climber;  
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Climber(){
		super ("Climber"); 
		climber = new TalonSRX(RobotMap.climberMotor);
		
	}
	
	public void climbUp(){
		climber.set(1.00);
	}
	
	public void climbDown(){
		climber.set(-1.00);
	}
	
	public void climbStop(){
		climber.set(0);
		
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

