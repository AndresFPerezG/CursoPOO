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
        UberX uberX = new UberX("AMQ123", new Driver(30, "Andrés Pérez", "112841", "a@a.com", "1234"), "Crevrolet", "Sentra");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberX uberX2 = new UberX("QIR789", new Driver(29, "Andrea Herrera", "101542", "b@b.com", "9876"), "Crevrolet", "Sentra");
        uberX2.setPassenger(4);
        uberX2.printDataCar();

        UberVan uberVan = new UberVan("QIR789", new Driver(28, "Mario Herrera", "3649", "u@b.com", "1876"), "song", "B1");
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        
    }
}