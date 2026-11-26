package locadora.classificacao;

import locadora.classificacao.abstratas.Classificacao;

public class Familia extends Classificacao {

    @Override
    public int getCodigoDoPreco() {
        return 1;
    }

    @Override
    public double getValorDaLocacao(int diasAlugado) {
        return 130.00 * diasAlugado;
    }

}
