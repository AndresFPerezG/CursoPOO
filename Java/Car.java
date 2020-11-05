package Java;

import javax.swing.JList.DropLocation;

class Car {
    Integer id;
    String license;
    String driver;
    Integer passangers;

    //Metodo para imprimir los datos de la clase
    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver);
    }

}
