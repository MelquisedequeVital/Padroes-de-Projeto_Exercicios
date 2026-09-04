package locadora.classificacao;

import locadora.classificacao.abstratas.Classificacao;

public class Luxo extends Classificacao {

    @Override
    public int getCodigoDoPreco() {
        return 2;
    }

    @Override
    public double getValorDaLocacao(int diasAlugado) {
        double valorLocacao;
        valorLocacao = 200.00 * diasAlugado;
        if(diasAlugado > 4){
            valorLocacao *= 0.9;
        }
        return valorLocacao;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        int pontos = PONTO_SIMPLES;
        if (diasAlugado > 2){
            pontos += PONTO_EXTRA;
        }
        return pontos;
    }

}
