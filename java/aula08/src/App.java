import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        
       // pedagio();

       PriorityQueue<Carro> fila = new PriorityQueue<>();
       
       fila.add(new Carro("Uno", 2));
       fila.add(new Carro("GOl", 2));
       fila.add(new Carro("Ambulancia", 1));
       fila.add(new Carro("Policia", 1));

       //Percorrer a fila de prioridade
       while(!fila.isEmpty()){
        Carro carro_removido = fila.poll();
        System.out.println("Carro Removido: "+carro_removido.getModelo());
       }
    
    }

    public static void pedagio() {
        // criar uma fila tradicional
        Queue<String> fila_carros = new LinkedList<>();

        //Carros chegando na fila
        fila_carros.offer("Uno");
        fila_carros.offer("Santana");
        fila_carros.offer("Fusca");
        fila_carros.offer("Gol G1");
        fila_carros.offer("Corsa");

        System.out.println("Situação da fila: "+fila_carros);

        //Realizando o atendimento no pedagio

        while (!fila_carros.isEmpty()) {
            String carro_removido = fila_carros.poll();
            System.out.println("Carro "+carro_removido+ " liberado no pedágio");
        }
    }

    public static void teste_filas(){
        //Criar fila de veiculos para o pedagio
        // fila comum: fifo

        //Adicionando elementos
        //offer: ao inserir é consultado a capacidade da fila. Caso a fila esteja cheia, não é inserido
        Queue<String> fila_carros = new LinkedList<>();
        fila_carros.offer("Uno");
        fila_carros.offer("Santana");
        fila_carros.offer("Fusca");

        // add: não consulta o tamanho da fila, em razão disso, poderá causar o overflow
        fila_carros.add("Gol G1");
        fila_carros.add("Corsa");

        // Quantos carros há na fila?
        System.out.println("Existe: "+fila_carros.size());;

        // Visualizar os elementos da fila
        for (String carro: fila_carros){
            System.out.println(carro);
        }

        //Primeiro da fila
        System.out.println("Inicio: "+fila_carros.peek());

        // ver todos
        System.out.println("Situação: "+fila_carros);

        //Remover veiculos
        String car = fila_carros.poll();
        System.out.println("Carro removido: "+ car);

        System.out.println("Situação: "+fila_carros);
    }
}
