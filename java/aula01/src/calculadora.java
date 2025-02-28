import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws Exception {
        // declaração de variaveis
        String operacao;
        double num1, num2, res=0;

        Scanner scanner = new Scanner(System.in); //entrda de dados em java

        // System.out.println: Exibição no terminal com quebra de linha
        // print: Exibir tudo na mesma linha
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite a operação: ");
        operacao = scanner.next();
        // System.out.println(operacao);
        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        if (operacao.equals("1")) {
            res = adicao(num1, num2);
        }else if (operacao.equals("2")){
            res = subtracao(num1, num2);
        }else if (operacao.equals("3")) {
            res = multiplicao(num1, num2);
        }else if (operacao.equals("4")) {
            res = divisao(num1, num2);
        }else{
            System.out.println("Operação Inválida");
        }

        System.out.println("O resultad: "+res);

    }

public static double adicao (double n1, double n2){
    return n1 + n2;
}
public static double subtracao (double n1, double n2){
    return n1 - n2;
}
public static double multiplicao (double n1, double n2){
    return n1 * n2;
}
public static double divisao (double n1, double n2){
    if (n2 == 0) {
        System.out.println("Error: Não é permitido dividir por zero");
    };
    return n1/n2;
}

}
