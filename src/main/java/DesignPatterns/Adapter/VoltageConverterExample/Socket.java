package DesignPatterns.Adapter.VoltageConverterExample;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
