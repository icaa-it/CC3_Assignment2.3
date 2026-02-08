public class Weapon {
    private String weaponName;

    public Weapon(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getName() {
        return weaponName;
    }

    public String identify() {
        return "I am the Weapon class. I define the equipment used in battles.";
    }
}