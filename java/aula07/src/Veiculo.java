public class Veiculo {
    private String Modelo;
    private String Marca;
    private int ano;
    
    public Veiculo() {
        
    }

    public Veiculo(String modelo, String marca, int ano) {
        Modelo = modelo;
        Marca = marca;
        this.ano = ano;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
