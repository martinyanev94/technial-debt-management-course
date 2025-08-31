interface VehicleModule {
    void checkEngine();
    void initSystem();
    void initOldRadio(); // never used
    void initMediaSystem(); // actual logic
}
