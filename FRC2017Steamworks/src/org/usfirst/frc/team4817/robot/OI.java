package org.usfirst.frc.team4817.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//import org.usfirst.frc.team4817.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick stick1= new Joystick(0);
	Joystick stick2= new Joystick (1);
	
	public OI(){
		
	}
	public double getLeftStick(){
		if(Math.abs(getLeftStick())< 0.05)
			return 0; 
		return stick1.getY(); 
	}
	
	public double getRightStick(){
		if(Math.abs(getRightStick())< 0.05)
			return 0; 
		return stick2.getY(); 
	}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	 Joystick stick = new Joystick(0);
	 Button shooterOut = new JoystickButton(stick1, 1);
	 Button shooterFix = new JoystickButton(stick1, 2);
	 Button button3= new JoystickButton(stick1, 3); 
			 

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());
	 shooterOut.whileHeld(new Shooter(0));
	 shooterFix.whileHeld(new Shooter(1));

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
