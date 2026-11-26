package chain;

import chain.prova.Desempenho;
import chain.prova.ExpEnsino;
import chain.prova.GestaoAcademica;
import chain.prova.Prova;
import chain.prova.Titulo;

public class Main {
    public static void main(String[] args) throws Exception {
        Candidato cand1 = new Candidato("Cand1", "mestre", "if", "coordenacao",80);

        Prova pps = new Desempenho();
        pps.setProx(new Titulo())
                .setProx(new ExpEnsino())
                .setProx(new GestaoAcademica());

        int notaTitulos = pps.avaliar(cand1, 0);

        int notaTitulosComLimite = Math.min(notaTitulos, 75);

        int notaFinal = cand1.getDesempenho() + notaTitulosComLimite;

        System.out.println("Nota Final: " + notaFinal);
    }
}
