public enum Configuration {
    INSTANCE;

    private String configSetting;

    public void setConfig(String setting) {
        this.configSetting = setting;
    }

    public String getConfig() {
        return configSetting;
    }
}
