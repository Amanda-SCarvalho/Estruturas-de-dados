public class Frutas {
    private String nome;
    private String cor;
    private int id;
    
    public Frutas(String nome, String cor, int id) {
        this.nome = nome;
        this.cor = cor;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
