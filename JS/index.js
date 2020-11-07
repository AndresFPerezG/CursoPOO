console.log(" ")
console.log("INFORMACIÓN DEL UBER: ")

var uberX = new UberX("A2456", new Driver("Andrea Ferran", "ANDA765", "b@b.com"), "Chevrolet", "Spark")
uberX.passenger = 4;
uberX.printDataCar();

/* ------------------------------------------------------------------------------*/

console.log(" ")
console.log("INFORMACIÓN DEL USUARIO: ")

var user1 = new User("carlos", "3215", "d@d.com")
user1.printDataUser()