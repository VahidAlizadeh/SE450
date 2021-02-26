package DesignPatterns.Decorator.CarExample;

public class CarManufacturingDriver {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
