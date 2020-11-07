from car import car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterials = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterials):
        super(UberVan, self).__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterials = seatsMaterials