import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    /*
     * public static void main(String[] args) throws Exception {
     * ArrayList<String> frutas = new ArrayList<>();
     * ArrayList<String> legumes = new ArrayList<>();
     * 
     * frutas.add("Maça");
     * frutas.add("Manga");
     * frutas.add("Melancia");
     * frutas.add("Maracuja");
     * frutas.add("Mamao");
     * 
     * System.out.println("A fruta é: " + frutas.get());
     * System.out.println("A fruta é: " + legumes.get());
     * 
     * // verifica se esta vazia
     * System.out.println("Frutas está vazia:" + frutas.isEmpty());
     * System.out.println("Frutas está vazia:" + legumes.isEmpty());
     * 
     * // Verifica o tamanho
     * System.out.println("O tamanho é: " + frutas.size());
     * System.out.println("O tamanho é: " + legumes.size());
     * 
     * // percorrendo uma lsta
     * for (int i = 0; i < frutas.size(); i++) {
     * System.out.println(frutas.get(i));
     * }
     * 
     * // foreach
     * for (String fruta : frutas) {
     * System.out.println(fruta);
     * }
     * 
     * // remover itens da lista
     * frutas.remove(0);
     * System.out.println(frutas.get(0));
     * 
     * ArrayList<Frutas> lista_objetos = new ArrayList<>();
     * Frutas f = new Frutas("Melancia", "Verde" , 1);
     * lista_objetos.add(f);
     * }
     */

    public static void main(String[] args) {
        /* lista_encadeada */
    }

    public static void lista_encadeada() {
        LinkedList<String> veiculos = new LinkedList<>();

        // Adicionando itens

        veiculos.add("Gol"); //0
        veiculos.add("Uno");//1
        System.out.println(veiculos.toString());

        veiculos.addLast("Mobi"); // 2
        veiculos.addLast("Kwid");// 3
        veiculos.addLast("HB20");// 4
        System.out.println(veiculos.toString());

        veiculos.addFirst("Astra");
        veiculos.addFirst("Argo");
        veiculos.addFirst("Onix");
        System.out.println(veiculos.toString());

        //obter atraves do index
        System.out.println(veiculos.get(2));

        //obter no inicio ou fim da lista
        System.out.println(veiculos.getFirst());
        System.out.println(veiculos.getLast());

        //Removendo elementos atraves do index
        veiculos.remove(2);

        //Remover no inicio ou no fim da lista
        veiculos.removeFirst();
        veiculos.removeLast();

        //Percorrendo a lista
        System.out.println(veiculos.toString());

        /* for(String veiculo : veiculos){
            System.out.println("O Veiculo é: " + veiculo);
        } */
    }

    public static void lista_simples() {

        ArrayList<String> frutas = new ArrayList<>();
        ArrayList<String> legumes = new ArrayList<>();

        frutas.add("Maça");
        frutas.add("Manga");
        frutas.add("Melancia");
        frutas.add("Maracuja");
        frutas.add("Mamao");

       /*  System.out.println("A fruta é: " + frutas.get());
        System.out.println("A fruta é: " + legumes.get()); */

        // verifica se esta vazia
        System.out.println("Frutas está vazia:" + frutas.isEmpty());
        System.out.println("Frutas está vazia:" + legumes.isEmpty());

        // Verifica o tamanho
        System.out.println("O tamanho é: " + frutas.size());
        System.out.println("O tamanho é: " + legumes.size());

        // percorrendo uma lsta
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        // foreach
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // remover itens da lista
        frutas.remove(0);
        System.out.println(frutas.get(0));

        ArrayList<Frutas> lista_objetos = new ArrayList<>();
        Frutas f = new Frutas("Melancia", "Verde", 1);
        lista_objetos.add(f);

    }

    public static void lista_encadeada_objs(){
        LinkedList<Veiculo> lista_objs_veiculos = new LinkedList<>();

        Veiculo v = new Veiculo("Fiat", "Uno", 1980);
        Veiculo v = new Veiculo("Fiat", "Mobi", 2020);

        lista_objs_veiculos.add(v);

        System.out.println(lista_lista_objs_veiculos.getLast().getModelo());

    }
}
