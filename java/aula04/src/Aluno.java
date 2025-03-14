public class Aluno {
    private String nome;
    private String curso;
    private int ra;
   
    public Aluno(String nome, String curso, int ra) {
        this.nome = nome;
        this.curso = curso;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }



    
}
