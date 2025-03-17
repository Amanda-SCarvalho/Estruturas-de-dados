//Criando um Array/Vetor com valores
 
//Usando Colchetes
let modelos = ['Gol', 'Corsa', 'Fusca', 12, true, false, null]
//ou
//Usando o construtor da Classe Array
let marcas = Array ('Chevrolet', 'Ford', 'Fiat')
 
 
//Criar um Array/Vetor sem valores (ou vazia)
let cores = [];
//ou
let categoria = new Array();
 
// exibir o conteúdo
console.log(modelos)
console.log(marcas)
console.log(cores)
console.log(categoria)
 
// Ele permiti limitar ao utilizar essa sintaxe
// Defini o valor fixo de 5
let clientes = new Array(5)
 
// Com o console.log é possivel converter um objeto array em texto para ser exibido no terminal
console.log(clientes)
 
//adicionando um elemento após a criação de um vetor/array ilimitada
 
//A função PUSH: adiciona um elemento no fim do vetor
marcas.push('Jeep')
 
//a função UNSHIFT: adiciona um elemento no inicio do vetor
marcas.unshift('VW')
console.log(marcas)
 
//A função POP: remove o ultimo elemento
marcas.pop()
console.log(marcas)
 
//A função SHIFT: remove o primeiro elemento
marcas.shift()
console.log(marcas)
 
//A função CONCAT: Concatena duas ou mais arrays em uma nova array
// selecionado e copiando uma parte do vetor
let frutas = ['Laranja','Melância', 'Kiwi', 'Uva', 'Manga']
let legumes = ['Batata', 'Cenoura', 'Milho']
 
let feira = frutas.concat(legumes)
 
console.log(feira)
 
//A função SLICE: faz uma copia superficial da array (ou parte), sem mudificar a array original
let frutas_sel = frutas.slice(1,4)
 
console.log(frutas_sel)

//A função SPLICE: altera o conteudo de um array, podendo substituir ou remover elementos
let frutas_c = frutas.splice(1,1,"Manga")
console.log(frutas_c)

//A função INCLUDES: verifica se todos os elementos do array passam no teste implantado
let situacao = frutas.includes("Manga")
console.log(situacao)

situacao = frutas.includes("Caju")
console.log(situacao)

//A função JOIN: Adiciona os elementos do array em uma string, separado com um delimitador especifico
let texto = frutas.join(",")
let texto1 = frutas.join(", ")
let texto2 = frutas.join("\n ")
let texto3 = frutas.join(" - ")

console.log(texto)
console.log(texto1)
console.log(texto2)
console.log(texto3)

//A função MAP: Cria um array com o resultado passado em uma função a cada elemento
let numeros = [0,1,2,3,4,5,6,7,8,9,10]
let tabuada = numeros.map(x=> x*2)

//console.log(tabuada)
//A função FILTER: cria um novo array sobre os elementos que passaram nos testes implementados na função
let pares = numeros.filter(x=> {if (x == 0){}else{ return x%2==0 }})

//console.log(pares)
// let mult=3
// let tabuada_dinamica = numeros.map(x=> {let i=1; while(i<=mult){
//     x=x*i;
//     i++;
//     return x;
// }})
// console.log(tabuada_dinamica)

//A função FIND: Retorna o valor do primeiro elemento que satifaz a função fornecida
let loc = numeros.find(x=> x>5)
console.log(loc) //6
loc = numeros.findIndex(x=> x>2)
console.log(loc) //3

//A função SOME: Verifica se pelo menos um elemento do array passa no teste implementado pela função fornecida
let return_some = numeros.some(x=> x>5)
console.log(return_some)

//A função EVERY: verifica se todos os elementos passam no teste
let return_every = numeros.every(x=>x>=0)
console.log(return_every)