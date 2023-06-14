
var url = "";
var num = "";
function actualizarURL(elemento) {
    url = elemento.value;
}
function actualizarNumero(elemento) {
    num = elemento.value;
}
function getCategories() {
    fetch("https://swapi.dev/api/", { method: "GET" })
        .then(result => result.json())
        .then(response => {
            const select = document.getElementById("selectCategory");
            console.log("SELECT:", select.innerHTML);
            console.log(response);
            console.log("SELECT:", select.innerHTML);
            for (key of Object.keys(response)) {
                console.log(key);
                select.innerHTML += `<option value="${response[key]}">${key}</option>`
            }
        })
}
getCategories();
async function buscarElemento() {
    const result = await fetch(url + num, { method: "GET" })
    const response = await result.json();
    console.log(response);

}