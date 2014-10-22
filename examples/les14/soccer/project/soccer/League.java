package soccer;

import java.util.ArrayList;
import java.util.Arrays;

public class League {
    PlayerDatabase theList;        
    public static void main (String[] args) {
        
        League theLeague = new League();
        
        // setup the teams
        Team[] theTeams = theLeague.setupTeams();

        // display teams
        //System.out.println(theLeague.getTeamPlayerList(theTeams));
        
        // setup the league games
        Game[] theGames = theLeague.setupGames(theTeams);
        
        // play all the games
        theLeague.play(theGames);
        
        // show results
        // second boolean argument increases the detail if set to true
        System.out.println(theLeague.getGameResults(theGames, true)); // uses getGameResults() method

        // show team rankings
        //System.out.println(theLeague.getRankedTeams(theTeams));

        // show player rankings (by team)
        //System.out.println(theLeague.getRankedPlayersByTeam(theTeams));

    }
    
    
    // Default version of setupTeams() method
    public Team[] setupTeams() {
        // PlayerList contains all the players.
        // Teams are composed of players from this pool
        // of players

        theList = new PlayerDatabase();

        // Initialize the teams - 36 players in player database.
        int teamSize = 5; // 5 a side
        Team[] theTeams = {new Team(theList.getTeam(teamSize), "The Blues"),
        new Team(theList.getTeam(teamSize), "The Reds"),
        new Team(theList.getTeam(teamSize), "The Greens")};

        return theTeams;
    }
    
    public Team[] setupTeams(int teamSize, String... teams) {
        
        theList = new PlayerDatabase();
        
        int numPossTeams = theList.players.size()/teamSize;
       
        if (teams.length < 2) throw new IllegalArgumentException("Need more than one team!");
        if (numPossTeams < teams.length) throw new IllegalArgumentException("Team is too big or too many teams!");
        Team[] theTeams = new Team[teams.length];
        
        for (int i = 0; i < teams.length; i++){
            theTeams[i] = new Team(theList.getTeam(teamSize), teams[i]);
        } 
        return theTeams;    
    }
    
    // And the teams are...
    public String getTeamPlayerList(Team[] theTeams) {
        String newLine = String.format("%n");
        StringBuilder teamList = new StringBuilder();
        teamList.append("========= Player List By Team ==========");
        teamList.append(newLine);
        for (Team thisTeam: theTeams) {
            teamList.append(thisTeam.getName());
            teamList.append(newLine);
            teamList.append(thisTeam.getPlayers());
            teamList.append(newLine);
        }
        return teamList.toString();
    }
    
    // Initialize the games
    public Game[] setupGames(Team[] theTeams) {
        // Initialize the games -- all play all home and away
        ArrayList theGames = new ArrayList();
        for (Team homeTeam: theTeams) {
            for (Team awayTeam: theTeams) {
                if (homeTeam!=awayTeam) theGames.add(new Game(homeTeam,awayTeam));
            }
        }
        return (Game[]) theGames.toArray( new Game[1] );
    }

    // Play all the games
    public void play(Game[] theGames) {
        for(Object currGame:theGames) {
            ((Game)currGame).playGame();
        }
    }
    
    // Get the results of each game
    public String getGameResults(Game[] theGames) {
       return getGameResults(theGames, false);
    }
    public String getGameResults(Game[] theGames, boolean areDetailsReqd) {
        String newLine = String.format("%n");
        StringBuilder gameResults = new StringBuilder();
        gameResults.append("========= Game List and Result ========");
        gameResults.append(newLine);
        for(Object currGame:theGames) {
            gameResults.append("==================================");
            gameResults.append(newLine);
            gameResults.append(((Game)currGame).getResult());
            gameResults.append(newLine);
            if (areDetailsReqd) {
                gameResults.append(((Game)currGame).getDetailedResult());
                gameResults.append(newLine);
            }
        }
        return gameResults.toString();
    }

    // List all the players ranked by goals scored
    public String getRankedPlayersByTeam(Team[] theTeams) {
        String newLine = String.format("%n");
        StringBuilder rankedPlayers = new StringBuilder();
        //teamResults.append("====================================== ");
        for (Team theTeam:theTeams) {
            rankedPlayers.append("========= Players Ranked By Goals ====== ");
            rankedPlayers.append(newLine);
            rankedPlayers.append(theTeam.getName());
            rankedPlayers.append(newLine);
            Player[] thePlayers = theTeam.getRankedPlayers(); // using getRankedPlayers() method
            for(Player currPlayer:thePlayers) {
                rankedPlayers.append(currPlayer.toString());
                rankedPlayers.append(" | ");
                rankedPlayers.append(((Player)currPlayer).getGoalsScored());
                rankedPlayers.append(newLine);
            }
        }
        return rankedPlayers.toString();
    }

    // List all the teams ranked by points (3 for a win, 1 for a draw, 0 for a loss)
    public String getRankedTeams(Team[] theTeams) {
        String newLine = String.format("%n");
        StringBuilder rankedTeams = new StringBuilder();
        rankedTeams.append("========= Teams Ranked By Points ======= ");
        rankedTeams.append(newLine);

        Arrays.sort(theTeams);
        for (Team theTeam:theTeams) {
            rankedTeams.append(theTeam.getName());
            rankedTeams.append(" | ");
            rankedTeams.append(theTeam.getTotalPoints());
            rankedTeams.append(newLine);
        }
        return rankedTeams.toString();
    }

}