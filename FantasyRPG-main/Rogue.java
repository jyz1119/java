public class Rogue extends Character {
    private int stealthLevel;
    private String daggerType;

    public Rogue(String id, String name, int level, int stealthLevel, String daggerType) {
        super(id, name);
        setLevel(level);
        this.stealthLevel = stealthLevel;
        this.daggerType = daggerType;
    }

    public void stab(Character target) {
        int damage;
        if (getLevel() <= 3) {
            damage = 10;
        } else if (getLevel() <= 5) {
            damage = 15;
        } else {
            damage = 20;
        }
        target.setHealth(target.getHealth() - damage);
        System.out.println(getCharacterName() + " stabs " + target.getCharacterName() + " with " + daggerType + " for " + damage + " damage!");
    }

    public void evade() {
        String message;
        if (stealthLevel < 5) {
            message = getCharacterName() + " needs a higher stealth level to evade attacks.";
        } else {
            message = getCharacterName() + " successfully evades the incoming attack.";
        }
        System.out.println(message);
    }

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Stealth Level: " + stealthLevel);
        System.out.println("Dagger Type: " + daggerType);
    }

    @Override
    public String toString() {
        return super.toString() + ", Stealth Level: " + stealthLevel + ", Dagger Type: " + daggerType;
    }
}