package soccer;

import java.util.ArrayList;
import java.util.Arrays;

public class Team implements Comparable{

    ArrayList players;
    String name;
    int totalPoints = 0;
    int goalsInGame =0;
    int totalGoals = 0;
    int result = 0; // Could use +1 win, -1 loss, 0 draw if useful

    
    public Team(Player[] playerList, String name) {
        //players = new ArrayList(playerList);
        players = new ArrayList();
        for (int i=0; i < playerList.length; i++) {
            players.add(playerList[i]);
        }
        this.name = name;
    }
    
    // Team order based on points scored, or if points equal on goals scored
    public int compareTo(Object theTeam){
        if (this.getTotalPoints() < ((Team)theTeam).getTotalPoints()){
            return 1;
        }
        else if (this.getTotalPoints() == ((Team)theTeam).getTotalPoints() &&
                this.getTotalGoals() < ((Team)theTeam).getTotalGoals()){
            return 1;
        }
        else {
            return -1;

        }
    }
    
    // Get players ranked by goalscoring
    public Player[] getRankedPlayers() {
        Player[] thePlayers = new Player[this.getPlayers().size()];
        this.getPlayers().toArray(thePlayers); // In order to use Arrays.sort();
        Arrays.sort(thePlayers);
        return thePlayers;
    }

    public ArrayList getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getGoalsInGame() {
        return goalsInGame;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public int getResult() {
        return result;
    }

}
