class Aluno {
    constructor(nome, ra, curso){
        this.nome = nome
        this.ra=ra
        this.curso=curso
    }
    imprimir(){
        console.log('Nome: '+this.nome)
        console.log('Ra: '+this.ra)
        console.log('Curso: '+this.curso)
    }
}

let alunos = [
    new Aluno('Kaue', 12345, "ADS"),
    new Aluno('Joao', 12345, "ADS"),
    new Aluno('Ana', 12345, "ADS"),
]

console.log(alunos)
alunos.forEach(aluno=>aluno.imprimir())