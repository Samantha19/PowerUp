package org.usfirst.frc.team219.robot.commands;

import org.usfirst.frc.team219.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DartDownvar extends Command {

	//Hint: there's almost nothing in this class
	
    public DartDownvar() {
    	requires(Robot.dart);
    	
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.dart.dartsDown();

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if((Robot.dart.getPot()>=17))
    	{
    		Robot.dart.dartsDownSLow();
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
    	return((Robot.dart.getPot()>=22));
    
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.dart.dartsStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
