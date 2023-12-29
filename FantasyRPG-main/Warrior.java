public class Warrior extends Character {
    private String weaponType;
    private String armorType;

    public Warrior(String id, String name, int level, String weaponType, String armorType) {
        super(id, name);
        setLevel(level);
        this.weaponType = weaponType;
        this.armorType = armorType;
    }

    public void chargeAttack(Character target) {
        int damage;
        switch (weaponType) {
            case "Sword":
                damage = getLevel() > 5 ? 50 : 25;
                break;
            case "Dagger":
                damage = 20;
                break;
            case "Crossbow":
                damage = 50;
                break;
            case "Staff":
                damage = 10;
                break;
            default:
                damage = 0;
                break;
        }
        target.setHealth(target.getHealth() - damage);
        System.out.println(getCharacterName() + " attacks " + target.getCharacterName() + " with " + weaponType + " for " + damage + " damage!");
    }

    public void shieldBlock() {
        String message;
        switch (armorType) {
            case "Shield":
                message = getCharacterName() + " is raising its shield.";
                break;
            case "Gauntlet":
                message = getCharacterName() + " is raising its gauntlets.";
                break;
            case "Helmet":
                message = getCharacterName() + "'s head is protected.";
                break;
            default:
                message = getCharacterName() + " I hope you're protected...somehow.";
                break;
        }
        System.out.println(message);
    }

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Weapon Type: " + weaponType);
        System.out.println("Armor Type: " + armorType);
    }

    @Override
    public String toString() {
        return super.toString() + ", Weapon Type: " + weaponType + ", Armor Type: " + armorType;
    }
}