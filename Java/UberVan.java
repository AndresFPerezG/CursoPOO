package Java;

class UberVan extends Car {
    String brand;
    String model;
    
    public UberVan(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
        }else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Marca: " + brand + " Modelo: " + model);
    }
}
