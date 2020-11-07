from payment import Payment

class Efectivo(Payment):
    
    def __init__(self, id):
    super(Efectivo, self).__init__(id)
