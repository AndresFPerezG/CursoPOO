class Driver extends Account{
    constructor(name, document, email){
        super(name, document, email)
    }
    printDataDriver(){
        const {name, document, email} = this
        
        console.log(`Nombre del conductor: ${name}`)
        console.log(`Documento del conductor: ${document}`)
        console.log(`Email del conductor: ${email}`)
    }

}