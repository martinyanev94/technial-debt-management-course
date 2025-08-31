public House build() {
    if (rooms <= 0) {
        throw new IllegalArgumentException("Number of rooms must be greater than zero.");
    }
    return new House(this);
}
