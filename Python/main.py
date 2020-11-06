"""  importar la clase [Car]
    from car = al nombre del archivo car.py sin su extensión
    import Car = importamos la clase Car con mayusculas
"""
from car import Car

if __name__ == "__main__":

    """ creamos un nuevo objeto de car 
    Car() -> es el método constructor de python """
    car = Car()
    car.license = "AMS654"
    car.driver = "Andrés Herrera"
    car.passangers = 4

    """ vars(obj) es un metodo de python que imprime los datos en formato Json 
        se le pasa el objeto como parámetro e imprime sus datos.
    """
    print(vars(car))

    car2 = Car()
    car2.passangers = 3
    car2.license = "KLJ652"
    car2.driver = "Martha Contreras"
    print(vars(car2))