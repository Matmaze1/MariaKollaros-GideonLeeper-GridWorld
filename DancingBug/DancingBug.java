import info.gridworld.actor.Bug;


public class DancingBug extends Bug
{
    private int position;
    private int[] spins;

    public DancingBug(int[] turns){
	position = 0;
	spins = turns;
    }

    
    public void act(){
	int here = spins[position % spins.length];
	for (int i = 0; i < here; i ++){
	    turn();
	}
	if (canMove()){
	    move();
	}
	else
	    turn();
	position ++;
    
    }
}
