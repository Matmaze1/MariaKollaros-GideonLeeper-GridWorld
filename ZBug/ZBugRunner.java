import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;


public class ZBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        ZBug alice = new ZBug(4);
        alice.setColor(Color.BLUE);
	ZBug harry = new ZBug(6);
	harry.setColor(Color.GREEN);
        world.add(new Location(2,5), alice);
	world.add(new Location(7,7), harry);
        world.show();
    }
}
