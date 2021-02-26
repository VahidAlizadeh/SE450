package DesignPatterns.Builder.RoasterExample;

public interface Builder {

    void buildCoolingTray();
    void buildExhaustSystem();
    void buildGasBurner();
    void buildPlatform();
    void buildMotor();
    void buildThermocouples();
    void buildInnerDrum();
    void buildMainBody();

    Roaster getRoaster();
}
