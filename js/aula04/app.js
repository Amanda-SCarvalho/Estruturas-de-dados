let matriz = [
    [1, 2],
    [3, 4],
    [5, 6]
]

console.log(matriz)

//acesso percorrido
for(let linha=0; linha<matriz.length;linha++){
    for(let col=0; col<matriz[linha].length;col++){
        console.log(matriz[linha][col])
    }
}

//acesso direto (posicional)
//exibir um valor
console.log(matriz[2][0])

//adicionar uma novo linha com colunas 
matriz.push(['Ana', 'Pedro'])
console.log(matriz)

//alterar o conteudo de uma determinada linha ou coluna(existente)
matriz[2][0] = 'Bruno'

// matriz[4][0] = 'Vinicios' esta com erro, pois a linha nao existe ainda

console.log(matriz)