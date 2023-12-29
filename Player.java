import java.util.ArrayList;
import java.util.List;

// Define the Player class
class Player {
    private String playerID;
    private String playerName;
    private List<Character> characters = new ArrayList<>();

    public Player(String id, String name) {
        this.playerID = id;
        this.playerName = name;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }
}