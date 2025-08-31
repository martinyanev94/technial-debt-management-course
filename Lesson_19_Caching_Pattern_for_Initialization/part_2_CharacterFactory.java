import java.util.HashMap;

class Character {
    private String name;
    private String type;

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

class CharacterFactory {
    private HashMap<String, Character> cache = new HashMap<>();

    public Character getCharacter(String name, String type) {
        String key = name + "-" + type;
        if (!cache.containsKey(key)) {
            Character newCharacter = new Character(name, type);
            cache.put(key, newCharacter);
            System.out.println("Creating a new character: " + name);
            return newCharacter;
        }
        System.out.println("Reusing existing character: " + name);
        return cache.get(key);
    }
}
