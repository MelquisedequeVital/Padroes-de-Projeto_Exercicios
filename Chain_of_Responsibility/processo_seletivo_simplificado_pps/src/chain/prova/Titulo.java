package chain.prova;

import chain.Candidato;

public class Titulo extends Prova{
    public Titulo(){
    }

    @Override
    public int avaliar(Candidato cand, int pontosTitulo){
        int pontosSubTotal = switch(cand.getTitulo().toLowerCase()){
            case "doutor" -> 25;
            case "mestre" -> 18;
            case "especialista" -> 10;
            default -> 0;
        };

        return chamarProximo(cand, pontosTitulo + pontosSubTotal);
    }
}
