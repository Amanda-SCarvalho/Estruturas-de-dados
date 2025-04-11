import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        // lista_simples();
        // lista_encadeada();
        lista_encadeada_objs();
    }


    public static void lista_encadeada_objs(){
        LinkedList<Veiculo> lista_objs_veiculos = new LinkedList<>();

        Veiculo v = new Veiculo("Fiat","Uno",1980);
        Veiculo v1 = new Veiculo("Fiat","Mobi",2020);

        lista_objs_veiculos.add(v);

        System.out.println(lista_objs_veiculos.getLast().getModelo());

        lista_objs_veiculos.add(v1);
        System.out.println(lista_objs_veiculos.getLast().getModelo());
    }

    public static void lista_encadeada() {
        LinkedList<String> veiculos = new LinkedList<>();

        // adicionar itens
        veiculos.add("Gol");// 0
        veiculos.add("Uno");// 1
        System.out.println(veiculos.toString());
        
        veiculos.addLast("Mobi");// 2
        veiculos.addLast("Kwid");// 3
        veiculos.addLast("HB20");// 4
        System.out.println(veiculos.toString());
     
        veiculos.addFirst("Astra"); //0
        veiculos.addFirst("Argo");//1
        veiculos.addFirst("Onix"); //2
        System.out.println(veiculos.toString());

        //obter através do index
        System.out.println(veiculos.get(2));

        //obter no inicio ou fim da lista
        System.out.println(veiculos.getFirst());
        System.out.println(veiculos.getLast());
        
        System.out.println("após a remoção");

        //remover elementos através do index
        veiculos.remove(2);
        System.out.println(veiculos.toString());

        //remover no inicio ou fim da lista
        veiculos.removeFirst();
        System.out.println(veiculos.toString());

        veiculos.removeLast();
        System.out.println(veiculos.toString());

        // percorrendo um lista
        
        // for (String veiculo : veiculos) {
        //     System.out.println(veiculo);
        // }


        System.out.println(veiculos.toString());

    }

    public static void lista_simples() {

        ArrayList<String> frutas = new ArrayList<>();
        ArrayList<String> legumes = new ArrayList<>();
        // adicionar elementos em uma lista
        frutas.add("Maçã");
        frutas.add("Manga");
        frutas.add("Melância");
        frutas.add("Maracujá");
        frutas.add("Mamão");

        // recuperar os elementos através do seu index
        System.out.println("A fruta é: " + frutas.get(0));
        System.out.println("A fruta é: " + frutas.get(3));

        // verificar se está vazia
        System.out.println("está vazia? " + frutas.isEmpty());
        System.out.println("está vazia? " + legumes.isEmpty());

        // tamanho da lista
        System.out.println("O tamanho é: " + frutas.size());
        System.out.println("O tamanho é: " + legumes.size());

        // percorrendo uma lista
        // for
        System.out.println("percorrendo com o for: ");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        // foreach
        System.out.println("percorrendo com o foreach: ");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // remover itens da lista
        frutas.remove(0);
        System.out.println(frutas.get(0));
        // System.out.println("percorrendo com o foreach: ");
        // for(String fruta : frutas){
        // System.out.println(fruta);
        // }

        ArrayList<Frutas> lista_objetos = new ArrayList<>();
        Frutas f = new Frutas("Melância", "Verde", 1);

        lista_objetos.add(f);
    }
}