public class Main {
    public static void main(String[] args) {
        // Create Players
        Player player1 = new Player("P001", "Player One");
        Player player2 = new Player("P002", "Player Two");

        // Create Characters
        Warrior gideon = new Warrior("GS001", "Gideon Stoneheart", 5, "Sword", "Chainmail");
        Mage elara = new Mage("EF001", "Elara Frostweaver", 1, "Ice");
        Rogue darian = new Rogue("DW001", "Darian Whisperwind", 10, 15, "Shuriken");

        // Create Skills
        Skill whirlwindSlash = new Skill("Whirlwind Slash", "A powerful spinning attack with a sword.");
        Skill dualWielding = new Skill("Dual Wielding", "Ability to fight with a weapon in each hand.");
        Skill frostNova = new Skill("Frost Nova", "Unleashes an explosion of ice to damage and slow enemies.");
        Skill lockpicking = new Skill("Lockpicking", "The art of unlocking doors and chests without a key.");

        // Assign Skills to Characters
        gideon.addSkill(whirlwindSlash);
        gideon.addSkill(dualWielding);
        elara.addSkill(frostNova);
        darian.addSkill(lockpicking);

        // Assign Characters to Players
        player1.addCharacter(gideon);
        player1.addCharacter(elara);
        player2.addCharacter(darian);

        // Test actions
        gideon.chargeAttack(darian);
        elara.castElementalSpell("Teleportation");
        darian.stab(gideon);
        gideon.shieldBlock();
        darian.evade();

        // Print Character information
        gideon.displayCharacterInfo();
        elara.displayCharacterInfo();
        darian.displayCharacterInfo();
    }
}