public class App {
    public static void main(String[] args) throws Exception {
        // Criação de matriz
        int[][] matriz = new int[3][2];

        // acesso direto: linha coluna
        // hard code ou código engessado
        matriz[0][0] = 1;
        matriz[0][1] = 2;

        matriz[1][0] = 3;
        matriz[1][1] = 4;

        matriz[2][0] = 5;
        matriz[2][1] = 6;

        //Tipagem incorreta
        // matriz[2][1] = "7";

        //Estourando a matriz; informar uma linha ou coluna inexistente
        // matriz[2][2] = 7;

        // Percorrendo a matriz
        // Primeiro FOR percorre a linha, segundo for percorre a coluna
        // consultar elementos
        // inserir elementos
        // remover elementos
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int col = 0; col < matriz[linha].length; col++) {
                System.out.print(matriz[linha][col] + " ");
            }
            System.out.println("");
        }

        //Vetor com valores inteiros
        int [] idade = new int[2];

        //Vetor sobre a classe aluno;
        Aluno[] alunos = new Aluno[3];

        //Instanciando a classe e preenchendo valores
        // Aluno a = new Aluno("kaue","ADS",12345);
        Aluno a = new Aluno("kaue", "ADS", 12345);
        Aluno a1 = new Aluno("Joao", "ADS", 56780);
        Aluno a2 = new Aluno("Ana", "ADS", 98710);

        //Guardando o aluno dentro do vetor
        alunos [0]=a;
        alunos [1]=a1;
        alunos [2]=a2;

        alunos[0] = new Aluno("kaue", "ADS", 12345);
        alunos[1] = new Aluno("Joao", "ADS", 56780);
        alunos[2] = new Aluno("Ana", "ADS", 98710);

        for(int i=0; i<alunos.length;i++){
            System.out.println(alunos[i].getNome());
            System.out.println(alunos[i].getCurso());
            System.out.println(alunos[i].getRa());
        }
    }
}
