public class Mage extends Character {
    private String elementalAffinity;

    public Mage(String id, String name, int level, String elementalAffinity) {
        super(id, name);
        setLevel(level);
        this.elementalAffinity = elementalAffinity;
    }

    public void castElementalSpell(String spellType) {
        if (getLevel() < 5) {
            System.out.println(getCharacterName() + " needs to reach level 5 to cast spells.");
            return;
        }
        String message;
        switch (spellType) {
            case "Teleportation":
                message = "Teleporting " + getCharacterName() + " out of danger!";
                break;
            case "Illusion":
                message = getCharacterName() + " is creating illusions to confuse the enemy.";
                break;
            case "Detection":
                message = getCharacterName() + " is detecting the presence of magic nearby...";
                break;
            default:
                message = "Unknown spell type.";
                break;
        }
        System.out.println(message);
    }

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Elemental Affinity: " + elementalAffinity);
    }

    @Override
    public String toString() {
        return super.toString() + ", Elemental Affinity: " + elementalAffinity;
    }
}