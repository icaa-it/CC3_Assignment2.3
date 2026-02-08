public class GameSystem {
    private Player player;     // Aggregation
    private Enemy enemy;       // Aggregation
    private Weapon weapon;     // Composition

    public GameSystem(Player player, Enemy enemy, Weapon weapon) {
        this.player = player;
        this.enemy = enemy;
        this.weapon = weapon;
    }

    public String startBattle() {
        return identify() + "\n"
             + player.identify() + "\n"
             + enemy.identify() + "\n"
             + weapon.identify() + "\n"
             + "Weapon equipped: " + weapon.getName() + "\n"
             + player.attack() + "\n"
             + enemy.react();
    }

    public String identify() {
        return "I am the GameSystem class. I control and manage the game battle.";
    }
}