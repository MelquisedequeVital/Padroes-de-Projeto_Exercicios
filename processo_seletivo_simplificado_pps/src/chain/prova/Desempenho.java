package chain.prova;

import chain.Candidato;

public class Desempenho extends Prova{

    public Desempenho(){

    }

    @Override
    public int avaliar(Candidato cand, int pontuacaoTItulo){
        if(cand.getDesempenho() < 70){
            return 0;
        }

        return chamarProximo(cand, pontuacaoTItulo);
    }

}
