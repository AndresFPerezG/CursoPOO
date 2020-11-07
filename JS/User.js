class User extends Account{
    constructor(name, document, email){
        super(name, document, email)
    }

    printDataUser(){
        const {name, document, email} = this

        console.log(`Nombre del usuario ${name}`)
        console.log(`Documento del usuario ${document}`)
        console.log(`Email del usuario ${email}`)
    }
   
}