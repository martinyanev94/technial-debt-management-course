interface Prototype {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    private String sampleField;

    public ConcretePrototype(String value) {
        this.sampleField = value;
    }

    public Prototype clone() {
        return new ConcretePrototype(sampleField);
    }

    public String getSampleField() {
        return sampleField;
    }
}
