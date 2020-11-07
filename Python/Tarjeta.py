from payment import Payment

class Tarjeta(Payment):
    num_tarjeta = int
    cvv         = str
    fecha       = str

    def __init__(self, id, num_tarjeta, cvv, fecha):
        super(Tarjeta, self).__init__(id)
        self.num_tarjeta = num_tarjeta
        self.cvv         = cvv
        self.fecha       = fecha