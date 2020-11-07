from payment import Payment

class PayPal (Payment):
    email   = str

    def __init__(self, id):
        super(PayPal, self).__init__(id)
        self.email = email