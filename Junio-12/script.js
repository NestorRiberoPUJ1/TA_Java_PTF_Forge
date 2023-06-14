// Espacio donde viven
let local = "Perrito";
var global;



function nombreFuncion(params) {
    //cuerpo
    let localParafuncion = 10;
    console.log(local);
    console.log(localParafuncion);
    for (let k = 0; k < 10; k++) {
        console.log(localParafuncion);
        {

        }
    }
}

function funcion2(parametros) {
    console.log(localParafuncion);
}

if (1 == 1) {
    local += 1;
    console.log(localParafuncion);
}