<?php

class Tarjeta extends Payment{
    public $num_tarjeta;
    public $cvv;
    public $fecha;

    public function __construct($id, $num_tarjeta, $cvv, $fecha){
        parent::__construct($id);
        this.$num_tarjeta = $num_tarjeta;
        this.$cvv = $cvv;
        this.$fecha = $fecha;
    }

}

?>