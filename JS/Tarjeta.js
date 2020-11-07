class Tarjeta extends Payment{
    constructor(id, num_tarjeta, cvv, fecha){
        super(id)
        this.num_tarjeta = num_tarjeta
        this.cvv = cvv
        this.fecha = fecha
    }
}