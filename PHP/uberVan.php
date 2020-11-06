<?php

require_once('car.php');

class UberVan extends Car {
    public $typeCarAccepted;
    public $seatMaterials;

    public function __construct($license, $drive, $typeCarAccepted, $seatMaterials){
        parent::__construct($license, $drive);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatMaterials = $seatMaterials;
    }

}

?>