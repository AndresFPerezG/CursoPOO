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
        Car car = new Car("AMQ123", new Account("Andrés Pérez", "1128418478"));
        car.passangers = 4;
        car.printDataCar();

        Car car2 = new Car("QIR789", new Account("Andrea Herrera", "1015425993"));
        car2.passangers = 4;
        car2.printDataCar();
        
        
    }
}