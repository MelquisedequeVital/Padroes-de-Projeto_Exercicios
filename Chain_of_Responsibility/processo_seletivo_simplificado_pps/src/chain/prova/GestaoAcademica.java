package chain.prova;

import chain.Candidato;

public class GestaoAcademica extends Prova{
    public GestaoAcademica(){}

    @Override
    public int avaliar(Candidato cand, int pontosTitulo){
        int pontosSubTotal = switch(cand.getGestaoAcad().toLowerCase()){
            case "direcao" -> 15;
            case "coordenacao" -> 10;
            default -> 0;
        };

        return chamarProximo(cand, pontosTitulo + pontosSubTotal);
    }
}
