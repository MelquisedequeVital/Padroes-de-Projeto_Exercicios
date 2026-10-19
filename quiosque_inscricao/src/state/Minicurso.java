package state;

public class Minicurso {
    private String nome;
    private double preco;
    private int vagas;

    public Minicurso(String nome, double preco, int vagas) {
        this.nome = nome;
        this.preco = preco;
        this.vagas = vagas;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getVagas() { return vagas; }

    public boolean temVaga() { return vagas > 0; }
    public void decrementarVaga() { if (vagas > 0) vagas--; }
}