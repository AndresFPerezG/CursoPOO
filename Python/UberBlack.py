from car import car

class UberBlack(Car):
    typeCarAccepted = []
    seatsMaterials = []
    
    def __init__(self, license, driver, typeCarAccepted, seatsMaterials):
        super(UberBlack, self).__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterials = seatsMaterials