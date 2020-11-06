"""
importar la clase [Car]
from car = al nombre del archivo car.py sin su extensión
import Car = importamos la clase Car con mayusculas

"""

"""
creamos un nuevo objeto de car 
Car() -> es el método constructor de python 

"""

""" 
vars(obj) es un metodo de python que imprime los datos en formato Json 
se le pasa el objeto como parámetro e imprime sus datos.

"""

from car import Car
from account import Account

if __name__ == "__main__":
   
    car = Car("QOR321", Account("Andrés Pérez", "112846"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("KLJ652", Account("Martha Contreras", "369852"))
    print(vars(car2))
    print(vars(car2.driver))