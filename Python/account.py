class Account:
    """ puedo asignar el tipo de dato que quiero usar """
    id = int
    name = str
    document = str 
    email = str
    password = int

    """ Método constructor de la clase """
    def __init__(self, name, document):
        self.name       = name
        self.document   = document    