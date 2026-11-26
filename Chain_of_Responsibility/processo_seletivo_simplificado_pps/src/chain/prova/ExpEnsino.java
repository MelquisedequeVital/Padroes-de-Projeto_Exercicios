package chain.prova;

import chain.Candidato;

public class ExpEnsino extends Prova{
    public ExpEnsino(){}

    @Override
    public int avaliar(Candidato cand, int pontosTitulo){
        int pontosSubTotal = switch(cand.getExpEnsino().toLowerCase()){
            case "if" -> 12;
            case "superior" -> 7;
            case "medio" -> 6;
            default -> 0;
        };

        return chamarProximo(cand, pontosTitulo + pontosSubTotal);
    }

}
