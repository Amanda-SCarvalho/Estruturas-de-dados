let pilha_pratos = []

//adicionar elementos
pilha_pratos.push("Prato Vermelho")
pilha_pratos.push("Prato Laranja")
pilha_pratos.push("Prato Azul")

console.log(pilha_pratos)

//Topo da pilha
console.log(pilha_pratos[pilha_pratos.length-1])

//tamanho da pilha
console.log(pilha_pratos.length == 0)

//Verifica se a pilha esta vazia
console.log(pilha_pratos.length == 0)
livros = []
console.log(livros.length == 0)

//remover elementos, função pop remove o ultimo
let removido = pilha_pratos.pop();

console.log(removido)
console.log(pilha_pratos)

/* 
// Definição de variaveis
var a;
let b;

const c = "Inicializar" // tem que inicializar, nao pode reatribuir */

//Definição de variaveis
function teste_var() {
    var x = 5;
    if (x > 0) {
        console.log(x)
        var y = 10;
    }
    // console.log(y)
    console.log(x) // era esperado o valor 5
}
function teste_let() {
    var x = 5;
    if (x > 0) {
        let x = 10;
        console.log(x)

    }
    console.log(x)
}

function teste_const() {
    const x = 5;
    if (x > 0) {
        const x = 10;
        const y = 10;
        y = 5;
        console.log(x)
        // console.log(y)

    }
    console.log(x)
}

teste_let()
teste_var()