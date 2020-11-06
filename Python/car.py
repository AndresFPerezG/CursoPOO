from account import Account

""" Se establece la clase Account para definir la cuenta el tipo de dato de driver """

""" def __init__(sef, variable, variable2, variable n...) define al constructor de la clase """


class Car:
    id = int
    license = str
    driver = Account("","") 
    passangers = int

    def __init__(self, license, driver):
        self.license    = license
        self.driver     = driver