package org.usfirst.frc.team219.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftLeftSwitch extends CommandGroup {

    public LeftLeftSwitch() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	addSequential (new DriveForward(-.5,2,false,false));
    	addSequential (new DriveTurn(130, 1, true));
    	addSequential(new DriveForward(-.5,.15,true,true));
    	addSequential(new DriveForward(0,1.2,true,true));
    	addSequential(new ShootSwitch());
    }
}
