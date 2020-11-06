package Java;

class Car {
    Integer id;
    String license;
    Account driver; //En la clase account, se creó la clase de la cual se deriva el conductor por eso se pone con ese tipo de dato
    Integer passangers;

    /*Método constructor de la clase
    Entre parentesis van los atributos obligatorios de la clase
    En el caso de Car, la licensia, porque cada carro obligatoriamente debe tener licensia
    */
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    //Metodo para imprimir los datos de la clase
    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name);
    }

}
