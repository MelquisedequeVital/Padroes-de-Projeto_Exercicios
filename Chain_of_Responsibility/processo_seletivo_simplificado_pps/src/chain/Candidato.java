package chain;

public class Candidato {
    public String nome;
    public String titulo;
    public String expEnsino;
    public String gestaoAcad;
    public int notaDesempenho;

    public Candidato(String nome, String titulo, String expEnsino, String gestaoAcad,
            int notaDesempenho) {
        this.nome = nome;
        this.titulo = titulo;
        this.expEnsino = expEnsino;
        this.gestaoAcad = gestaoAcad;
        this.notaDesempenho = notaDesempenho;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getExpEnsino() {
        return expEnsino;
    }

    public void setExpEnsino(String expEnsino) {
        this.expEnsino = expEnsino;
    }

    public String getGestaoAcad() {
        return gestaoAcad;
    }

    public void setGestaoAcad(String gestaoAcad) {
        this.gestaoAcad = gestaoAcad;
    }

    public int getDesempenho() {
        return notaDesempenho;
    }

    public void setNotaDesempenho(int notaDesempenho) {
        this.notaDesempenho = notaDesempenho;
    }

}
