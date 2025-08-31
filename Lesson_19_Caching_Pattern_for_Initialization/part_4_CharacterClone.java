class Character {
    // existing fields and constructor here...

    public Character clone() {
        return new Character(this.name, this.type);
    }
}
