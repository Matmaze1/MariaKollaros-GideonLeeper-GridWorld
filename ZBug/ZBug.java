import info.gridworld.actor.Bug;


public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int maximum;
    private int total;

    
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
	setDirection(90);
	total = length * 3;
	maximum = 0;
    }

    public void act(){

	if (steps < sideLength && canMove() && maximum < total){
	    move();
	    steps++;
	    maximum ++;
	}

	else if (steps == sideLength && getDirection() == 90){
		
	    while (getDirection() != 225){
		turn();
	    }
	    steps = 0;
	}
	else if (steps == sideLength && getDirection() == 225){
	    while (getDirection() != 90){
		turn();
	    }
	    steps = 0;
	}
    }
}

