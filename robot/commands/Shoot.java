package org.usfirst.frc.team219.robot.commands;

import org.usfirst.frc.team219.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {

	double frontSpeed,midSpeed,backSpeed;
	Timer timer;
	boolean auton = false;
	public Shoot(double front,double mid,double back) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.squish);
    	frontSpeed = front;
    	midSpeed = mid;
    	backSpeed = back;
    	timer = new Timer();
    	auton = false;
    }
	public Shoot(double front,double mid,double back, boolean auto) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.squish);
    	frontSpeed = front;
    	midSpeed = mid;
    	backSpeed = back;
    	timer = new Timer();
    	auton = auto;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	Robot.squish.varSpeed(frontSpeed, midSpeed, backSpeed);
    	if(!auton)
    	{
    		timer.start();
    	}

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(!auton)
    	{
    		return timer.get()> 1.2;
    	}
    	else
    	{
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	if(!auton)
    	{
    		timer.stop();
    		timer.reset();
    		Robot.squish.varSpeed(0, 0, 0);
    	}
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
