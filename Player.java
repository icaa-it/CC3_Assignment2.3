public class Player {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String attack() {
        return playerName + " attacks using a weapon!";
    }

    public String identify() {
        return "I am the Player class. I represent the character controlled by the user.";
    }
}