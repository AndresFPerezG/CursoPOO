<?php

require_once('car.php');

class UberBlack extends Car{
    public $typeCarAccepted;
    public $seatMaterials;

    public function __construct($license, $driver, $typeCarAccepted, $seatMaterials){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatMaterials = $seatMaterials;
    }
}

?>