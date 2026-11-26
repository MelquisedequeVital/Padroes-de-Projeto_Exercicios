package locadora.classificacao.abstratas;

public abstract class Classificacao {
    public final int PONTO_SIMPLES = 1;
    public final int PONTO_EXTRA = 2;

    public abstract int getCodigoDoPreco();
    public abstract double getValorDaLocacao(int diasAlugado);
    public int getPontosDeAlugadorFrequente(int diasAlugado){
        return PONTO_SIMPLES;
    }

}
