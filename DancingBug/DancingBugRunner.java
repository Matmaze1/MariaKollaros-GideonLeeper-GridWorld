import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
	int[] harry = new int[] {3,6,7,2,5};
        DancingBug alice = new DancingBug(harry);
        alice.setColor(Color.BLUE);
        world.add(new Location(4, 4), alice);
        world.show();
    }
}
