import info.gridworld.actor.Bug;

public class CircleBug extends Bug
{
    private int steps;
    private int sideLength;


    public CircleBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /*This behavoir is different that boxBug because after either the bug has completed its sidelength or it can no longer move forward it only turns 45 degress as opposed to 90 degrees. CircleBug no longer forms a square or any definite shape for that matter.*/
   
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }
}
