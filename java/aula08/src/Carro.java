public class Carro implements Comparable<Carro> {
    private String modelo;
    private int prioridade;


    public Carro(String modelo, int prioridade) {
        this.modelo = modelo;
        this.prioridade = prioridade;
    }

    // Ordenar os veículos: Menor para o de maior prioridade
    @Override
    public int compareTo(Carro c){
        return Integer.compare(prioridade, c.prioridade);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

}
