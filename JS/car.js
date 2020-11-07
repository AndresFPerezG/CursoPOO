class Car {

    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar() {
        console.log(`Nombre del conductor: ${this.driver.name}`)
        console.log(`Documento del conductor: ${this.driver.document}`)
        console.log(`Correo del conductor: ${this.driver.email}`)
        console.log(`Marca de Uber: ${this.brand}`)
        console.log(`Modelo del Uber: ${this.model}`)
    }
    
}