package soccer;

public class Goal implements Comparable {

    protected Team theTeam;
    protected Player thePlayer;
    protected int theTime;


    public int compareTo(Object theGoal){

        if (this.getTheTime() > ((Goal)theGoal).getTheTime()){
            return 1;
        }
        else {
            return -1;

        }
    }

    public Team getTheTeam() {
        return theTeam;
    }

    public Player getThePlayer() {
        return thePlayer;
    }

    public int getTheTime() {
        return theTime;
    }
}
