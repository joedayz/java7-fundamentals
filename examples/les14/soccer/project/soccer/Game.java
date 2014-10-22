package soccer;
import java.util.Arrays;

public class Game {
    
    // Points for a win or draw. 
    final int WIN = 3;
    final int DRAW = 1;
    
    private Team homeTeam;
    private Team awayTeam;
    
    private Team[] teamScored;
    private Player[] playerScored;
    private int[] timeScored;
    private Goal[] goals;
            
    private int totalNumberOfGoals;
    private String gameResultMessage = "";
    private String score = "";
    
    public Game(Team team1, Team team2) {

        homeTeam = team1;
        awayTeam = team2;
        gameResultMessage = homeTeam.getName() + " vs. " + awayTeam.getName() + " ";
             
    }

    public String getResult() {
        return this.getGameResultMessage();
    }

    public String getDetailedResult() {
        String newLine = String.format("%n");
        StringBuilder detailedResult = new StringBuilder();
        for (int i = 0; i < getGoals().length; i++) {
            detailedResult.append(getGoals()[i].getTheTime());
            detailedResult.append(" | ");
            detailedResult.append(getGoals()[i].getTheTeam().getName());
            detailedResult.append(" | ");
            detailedResult.append(getGoals()[i].getThePlayer());
            detailedResult.append(newLine);
        }
        return detailedResult.toString();
    }
    
    public void playGame () {

        homeTeam.goalsInGame = 0;
        awayTeam.goalsInGame = 0;
                
        setTotalNumberOfGoals((int) (Math.random()*8));
        
        setGoals(new Goal[getTotalNumberOfGoals()]);

        for(int i = 0; i < getTotalNumberOfGoals(); i++) {
            getGoals()[i] = new Goal();
            goals[i].theTime = (int) (Math.random()*90);
        }

        Arrays.sort(getGoals());

        for(int i = 0; i < getTotalNumberOfGoals(); i++) {

            goals[i].theTeam = (int)(Math.random()*2)==0?getHomeTeam():getAwayTeam();
            goals[i].theTeam.goalsInGame++;
            goals[i].theTeam.totalGoals++;
            goals[i].thePlayer = (Player)(getGoals()[i].getTheTeam().getPlayers()).get((int)(Math.random()*getHomeTeam().getPlayers().size()));
            goals[i].getThePlayer().setGoalsScored(goals[i].getThePlayer().getGoalsScored() + 1);
        }
        setTeamPoints();
    }
    
    public void setTeamPoints() {

        if (getHomeTeam().getGoalsInGame() > getAwayTeam().getGoalsInGame()) {
            homeTeam.totalPoints += WIN;    // 3 for a win
            // set game winner - home team wins
            homeTeam.result = 1;
        } else if (getAwayTeam().getGoalsInGame() > getHomeTeam().getGoalsInGame()) {
            awayTeam.totalPoints += WIN;    // 3 for a win
            // set game winner - away team wins
            awayTeam.result = 1;
        }
        else {
            homeTeam.totalPoints += DRAW;
            awayTeam.totalPoints += DRAW;
            //
            // result is a draw
        }
        setScore(score + "( " + getHomeTeam().getGoalsInGame() + " - " + getAwayTeam().getGoalsInGame() + " )");
        setGameResultMessage(getGameResultMessage() + score);
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Team[] getTeamScored() {
        return teamScored;
    }

    public void setTeamScored(Team[] teamScored) {
        this.teamScored = teamScored;
    }

    public Player[] getPlayerScored() {
        return playerScored;
    }

    public void setPlayerScored(Player[] playerScored) {
        this.playerScored = playerScored;
    }

    public int[] getTimeScored() {
        return timeScored;
    }

    public void setTimeScored(int[] timeScored) {
        this.timeScored = timeScored;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }

    public int getTotalNumberOfGoals() {
        return totalNumberOfGoals;
    }

    public void setTotalNumberOfGoals(int totalNumberOfGoals) {
        this.totalNumberOfGoals = totalNumberOfGoals;
    }

    public String getGameResultMessage() {
        return gameResultMessage;
    }

    public void setGameResultMessage(String gameResultMessage) {
        this.gameResultMessage = gameResultMessage;
    }
    
        public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
