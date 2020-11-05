package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andrés Pérez";
        car.passangers = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.driver = "Andrea Herrera";
        car2.license = "QIR789";
        car2.passangers = 3;
        car2.printDataCar();
        
        
    }
}