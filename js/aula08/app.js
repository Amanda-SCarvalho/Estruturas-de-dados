// Criar uma fila
let carro = []

//Adicionando veiculos: FIFO
carro.push("Uno")
carro.push("Gol")
carro.push("Santana")

//Visualizar a fila
console.log(Carro)

//Remover da fila
carro.shift()

console.log(carro)

//fila de prioridade
let fila_priori = [
    {modelo: "Uno", prioridade: 2},
    {modelo: "Gol", prioridade: 2},
    {modelo: "Ambulancia", prioridade: 1},
    {modelo: "Policia", prioridade: 1},
]

fila_priori.sort((carro_a,carro_b)=> carro_a.prioridade - carro_b.prioridade)

// carro b vem antes do carro b
// carro b vem antes do carro a
// se estão na mesma prioridade

//console.log