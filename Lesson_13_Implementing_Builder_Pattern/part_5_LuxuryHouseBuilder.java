public class LuxuryHouseBuilder extends HouseBuilder {
    private boolean hasSwimmingPool;
    
    public LuxuryHouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    @Override
    public House build() {
        // Additional validation for luxury features...
        return new House(this);
    }
}
