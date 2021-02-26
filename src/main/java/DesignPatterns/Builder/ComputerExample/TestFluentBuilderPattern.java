package DesignPatterns.Builder.ComputerExample;

public class TestFluentBuilderPattern {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("1 TB", "32 GB")
                                    .setBluetoothEnabled(false)
                                    .setGraphicsCardEnabled(true).build();

        comp.displySpec();
    }
}
