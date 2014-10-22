package soccer;

public class Player implements Comparable {
    String name;
    private int goalsScored;

    Player() {

    }
    Player(String name) {
        this.name = name;
    }
    
    public String toString() {
        return this.name;
    }

    public int compareTo(Object thePlayer){

        if (this.getGoalsScored() < ((Player)thePlayer).getGoalsScored()){
            return 1;
        }
        else {
            return -1;

        }
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }


}
