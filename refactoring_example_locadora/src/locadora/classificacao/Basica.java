package locadora.classificacao;

import locadora.classificacao.abstratas.Classificacao;

public class Basica extends Classificacao {

    @Override
    public int getCodigoDoPreco() {
        return 0;
    }

    @Override
    public double getValorDaLocacao(int diasAlugado) {
        return 90.0 * diasAlugado;
    }

}
