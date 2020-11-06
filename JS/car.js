class Car{
    constructor(license, driver){
        this.license = license
        this.driver = driver
    }

    printDataCar(){
        var {license, driver} = this
        console.log(`EL conductor se llama: ${driver.name} con documento # ${driver.document} y la licensia es: ${license}`)
    }

}