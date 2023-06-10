// Primitivos
var nombre; //Declaración de variable
var perrito = "Pluto"; //Declaración con inicalización 
let raza = "galgo"; //let variable local
const pi = 3.14159;
const lados_del_cuadrado = 4;
let graduado = false;
let letra = "a"


//No primitivas

var ciudades = ["NY", "NJ", "BT", false, 12]; //lista o arreglo 
console.log(ciudades[2]);

var contactos = {
    hermano: 3110102132,
    madre: 31203123321,
    padre: 1232131232,
    cantidad: 3,
    actualizados: true
}
contactos.hermano;
contactos["madre"];

//Anidaciones
let Estados = [{ nombre: "Washington", capital: "Seattle" }, { nombre: "Maryland", capital: "Baltimore" }]
let contactosEmergencia = {
    madre: { celular: 1233214, fijo: 132321321 },
    hermano: { celular: 1233214, fijo: 132321321 },
    padre: { celular: 1233214, fijo: 132321321 },
}

const NBA = {
    East: ["Knicks", "Heat", "Magic", "Celtics"],
    West: ["Lakers", "Warriors", "Spurs", "Nuggets"]
}


// Qué es JSON? JavaScript Object Notation
console.log(NBA);
console.log(JSON.stringify(NBA));

var elemento = `{"East":["Knicks","Heat","Magic","Celtics"],"West":["Lakers","Warriors","Spurs","Nuggets"]}`;
console.log(JSON.parse(elemento).East);

//Espacio donde habitan
var global;
let local;