package soccer;

import java.util.ArrayList;

public class PlayerDatabase {
        
    ArrayList players;

    public PlayerDatabase() {
        
        players = new ArrayList();
        
        players.add(new Player("Charles Dickens"));
        players.add(new Player("Wilkie Collins"));
        players.add(new Player("Oscar Wilde"));
        players.add(new Player("Frank O'Connor"));
        players.add(new Player("Liam O'Flaherty"));
        players.add(new Player("Henry James"));
        players.add(new Player("O. Henry"));
        players.add(new Player("James Joyce"));
        players.add(new Player("Marcel Proust"));
        players.add(new Player("Emile Zola"));
        players.add(new Player("Charlotte Bronte"));
        players.add(new Player("Jane Austin"));
        players.add(new Player("William Makepeace Thackeray"));
        players.add(new Player("Baroness Orczy"));
        players.add(new Player("Boris Pasternik"));
        players.add(new Player("Alexander Solzhenitsyn"));
        players.add(new Player("William Shakespeare"));
        players.add(new Player("Chaucer"));

        players.add(new Player("Graham Green"));
        players.add(new Player("Brian Moore"));
        players.add(new Player("Samuel Beckett"));
        players.add(new Player("Sean O'Casey"));
        players.add(new Player("J. M. Synge"));
        players.add(new Player("Brendan Behan"));
        players.add(new Player("Alan Patton"));
        players.add(new Player("W. B. Yeats"));
        players.add(new Player("J. R. Tolkien"));
        players.add(new Player("G. K. Chesterton"));
        players.add(new Player("Arthur Conan Doyle"));
        players.add(new Player("George Eliot"));
        players.add(new Player("Mark Twain"));
        players.add(new Player("Anthony Trollope"));
        players.add(new Player("Leo Tolstoy"));

        players.add(new Player("Agatha Christie"));
        players.add(new Player("Dorothy Parker"));
        players.add(new Player("Ayn Rand"));

    }
    
    public Player[] getTeam(int numberOfPlayers){
        
        Player[] team = new Player[numberOfPlayers];

        // Check enough players available 
        // (Could throw a custom Exception here for more elegant recovery from error.)
        if (players.size() < numberOfPlayers) {
            System.out.println("Not enough players available to create this team");
            System.out.println("Add more players to database or have less or smaller teams in League.");
            System.exit(0);
        }
        for (int i = 0; i < numberOfPlayers; i++) {

            int playerIndex = (int) (Math.random()*players.size());
            team[i] = (Player)players.get(playerIndex);
            // Remove that player from database
            players.remove(playerIndex);
            
            
        }
    
        return team;
    }
   
}
