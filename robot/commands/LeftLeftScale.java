package org.usfirst.frc.team219.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftLeftScale extends CommandGroup {

    public LeftLeftScale() {
    	
    	//prep the wheels
    	addParallel(new Shoot(.5,.5,0,true));
    	
    	//accelerate steadily
    	addSequential(new DriveForward(-.25,.1,false,false)); 
    	addSequential(new DriveForward(-.5,.1,false,false)); 
    	addSequential(new DriveForward(-.75,1.3,false,false));
    	
    	//start accelerating steadily in the opposite direction
    	addSequential(new DriveForward(-.7,.3,false,false));
    	addSequential(new DriveForward(-.6,.3,false,false));
    	addSequential(new DriveForward(-.5,.3,false,false));
    	
    	//turn towards the scale
    	addSequential(new DriveTurn(56,.5,false));
    	addSequential(new DriveForward(-.45,.1,false,false));
    	//drive forward for the last lil bit
    	addParallel(new Shoot(.68,.59,.75));
    	
    	
    	addSequential(new DriveForward(-.45,.1,false,false));
    	
    	
    	//start the shot while slowing down in preperation of turning around
    	addParallel(new DartDown());
    	addSequential(new DriveForward(-.4,.1,false,false));
    	addSequential(new DriveForward(-.35,.2,false,true));
    	
    	addSequential(new DriveForward(-.25,.15,true,true));
    	
    	//get out while bringing arm down
    	//addParallel(new DartDown());
    	addSequential(new DriveForward(.6,1,true,true));
    	
    	//turn towards second perp
    	
    	addSequential(new DimeTurn(147));//147
    	
    	//start trying to harvest
    	addParallel(new HarvestAuto(24));
      	addSequential(new DriveForward(-.3,2.2,true,true));
      	//addSequential(new DriveForward(.3,.4,true,true));
      	//get lined up for a second shot
      	addSequential(new DriveTurnReverse(-60,.3,true));
      	addSequential(new DriveTurnReverse(85,.3,true));
      	addSequential(new DriveTurnReverse(50,.75,true));
    	addSequential(new DriveForward(0,1,true,true));
      	addSequential(new Shoot(.65,.57,.75));
      	//(.58, .6,.75) potential
      	
     	//[addSequential(new DriveTurnReverse(100,.4,true));
     
     	
//     	addSequential(new DriveForward(.3,1.2,true,true));
//     	addSequential(new DimeTurn(-145));
//     	
//     	addSequential(new DriveForward(-.4,.9,true,true));
//     	addParallel(new Shoot(.68,.59,.75));
//     	addSequential(new DriveForward(-.3,.2,true,true));
     	
     	
     	//shoot the second one
     	//addParallel(new Shoot(.70,.60,.75));//.7,.7,.75
    	//addSequential(new DriveForward(-.3,.25,true,true));
//    	addSequential(new DriveTurn(-12,.5,false));
//    	addSequential(new DartUpx2(23));
//    	
//    	addSequential(new DriveForward(-.5,3.55,false,false));
//    	
//    	//addSequential(new DriveForward(-.75,2.37,false,false));
//    	addSequential(new DriveTurn(89,.5,false));
//    //	addSequential(new DriveForward(-.5,.17,true,true));
//    	addParallel(new Shoot(1,1,0,true));
//    	addSequential(new DriveForward(0,1,true,true));//.3?
//    	addSequential(new Shoot(.70,.70,.75));
//    	addSequential(new DriveForward(0,1,true,true));
//    	addSequential(new Shoot(0,0,0));
//    	addSequential(new DimeTurn(240));
//    	addSequential(new DriveForward(-.4,1.3,true,true));
//    	addSequential(new DartDown());
//    	//addParallel(new Harvest());
//       //	addSequential(new DriveForward(-.2,1,true,true));
//    	//addSequential(new DriveForward(.2,1,true,true));
//    	//addSequential(new HarvestRetract(23);
//    	//addSequential(new DriveForward(.4,1.3,true,true));
//    	//addSequential(new DimeTurn(-240));
//
//    	//addSequential(new DriveTurnReverse(68,.5,false));
//    	//addSequential(new SideShot(0,0,0,0,0,0));
    }
}
