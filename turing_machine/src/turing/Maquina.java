package turing;

public class Maquina {
    private EstadoMaquina estado;
    private boolean[] fita = new boolean[100000];
    private int posicao = fita.length/2;
    private int passos = 0;

    public Maquina(EstadoMaquina estadoInicial){
        this.estado = estadoInicial;
    }

    public void escreverNaFita(boolean valor){
        this.fita[posicao] = valor;
    }

    public boolean getValorAtual(){
        return this.fita[posicao];
    }

    public void moverParaEsquerda(){
        this.posicao -= 1;
    }

    public void moverParaDireita(){
        this.posicao += 1;
    }

    public void processar(){
        boolean continuar;
        do{
            continuar = this.estado.processar(this);
        } while (continuar);
        
    }

    public void setEstado(EstadoMaquina estado){
        this.estado = estado;
    }

    public void addPasso(){
        this.passos += 1;
    }

    public int getPassos(){
        return this.passos;
    }
}
