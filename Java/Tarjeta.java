package Java;

class Tarjeta extends Payment {
    Integer numero_tarjeta;
    String  cvv;
    String  fecha;

    public Tarjeta(Integer id, Integer numero_tarjeta, String cvv, String fecha){
        super(id);
        this.numero_tarjeta = numero_tarjeta;
        this.cvv = cvv;
        this.fecha = fecha;
    }

}
