<?php

require_once('account.php');

class Driver extends Account{

    public function __construct($id, $name, $document, $email, $password){
        parent::__construct($id, $name, $document, $email, $password);
    }
}

?>