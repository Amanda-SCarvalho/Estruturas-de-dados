import java.util.Scanner;

public class App {
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
            res = num1 + num2;
        }else if (operacao.equals("2")){
            res = num1 - num2;
        }else if (operacao.equals("3")) {
            res = num1 * num2;
        }else if (operacao.equals("4")) {
            res = num1/num2;
        }else{
            System.out.println("Operação Inválida");
        }

        System.out.println("O resultad: "+res);

    }
}
