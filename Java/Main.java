package Java;

class Main {
    public static void main(String[] args) {

        /*
        SINTAXIS crear instancias de las clases (nuevos objetos): 
        Car = [tipo de la clease Car] - con mayuscula inicial
        car = es el nombre del nuevo objeto
        new = palabra reservada para crear el nuevo objeto
        Car(); = clase Car, clase Padre
        */

        /*
        Según el método constructor se pasan dos parametros 
        al nuevo objeto (license, driver(se crea el nuevo conductor 
        con los datos requeridos para la clase Account))
        */
        Car car = new Car("AMQ123", new User(30, "Andrés Pérez", "112841", "a@a.com", "1234"));
        car.passangers = 4;
        car.printDataCar();

        Car car2 = new Car("QIR789", new Driver(29, "Andrea Herrera", "101542", "b@b.com", "9876"));
        car2.passangers = 4;
        car2.printDataCar();
        
        
    }
}