package Java;

class Car {
    private Integer id;
    private String license;
    private Account driver; //En la clase account, se creó la clase de la cual se deriva el conductor por eso se pone con ese tipo de dato
    private Integer passenger;

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
      
        System.out.println("License: " + license + " Driver: " + driver.name + " Pasajeros permitidos: " + passenger);
        
    }

    /*GETTER AND SETTER
        permite dar acceso a una variable privada para ser utilizada de forma pública
    */

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
