import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> pilha_pratos = new Stack<>();

        pilha_pratos.push("Prato Laranja"); //Base
        pilha_pratos.push("Prato Azul");
        pilha_pratos.push("Prato Verde");
        pilha_pratos.push("Prato Vermelho"); //Topo

        // Função SIZE: mostra o tamnho da pilha
        int tamanho = pilha_pratos.size();
        System.out.println("Tamanho da pilha é: "+tamanho);

        //Função POP: Mostra qual item foi removido da pilha
        String removido = pilha_pratos.pop();
        System.out.println("O prato removido foi: "+removido);

        tamanho = pilha_pratos.size();
        System.out.println("Tamanho da pilha é: "+tamanho);

        String topo = pilha_pratos.peek();
        System.out.println("O prato que esta no topo: "+ topo);

        //Função EMPTY: mostra se a pilha esta vazia, usando true ou false
        Boolean r = pilha_pratos.empty();
        System.out.println("A pilha esta vazia: "+ r);

        System.out.println("Elementos da pilha (topo ate a base)");

        for(int i=pilha_pratos.size()-1;i<=0;i--){
            System.out.println(pilha_pratos.get(i));
        }
    }
}
