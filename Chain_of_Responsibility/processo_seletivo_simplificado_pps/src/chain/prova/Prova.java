package chain.prova;
import chain.Candidato;

public abstract class Prova {
    public Prova prox;

    public Prova(){}

    public abstract int avaliar(Candidato cand, int pontosTitulo);

    public int chamarProximo(Candidato cand, int pontosTitulo){
        if(this.prox == null){
            return pontosTitulo;
        }

        return this.prox.avaliar(cand, pontosTitulo);
    }

    public Prova setProx(Prova prox){
        this.prox = prox;
        return prox;
    }
}
