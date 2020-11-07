from car import Car

class UberMio (Car):
    brand = str
    model = str

    def __init__(self, license, dirver, brand, model):
        super(UberMio, self).__init__(license, driver)
        self.brand = brand
        self.model = model