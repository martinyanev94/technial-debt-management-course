public class Game {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character warrior1 = factory.getCharacter("Warrior", "Fighter");
        Character warrior2 = factory.getCharacter("Warrior", "Fighter");
        Character mage = factory.getCharacter("Mage", "Spellcaster");
        Character rogue = factory.getCharacter("Rogue", "Thief");

        System.out.println(warrior1.getName() + " is a " + warrior1.getType());
        System.out.println(warrior2.getName() + " is a " + warrior2.getType());
        System.out.println(mage.getName() + " is a " + mage.getType());
        System.out.println(rogue.getName() + " is a " + rogue.getType());
    }
}
