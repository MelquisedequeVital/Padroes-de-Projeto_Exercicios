package locadora.factory;

import locadora.classificacao.Basica;
import locadora.classificacao.Familia;
import locadora.classificacao.Luxo;
import locadora.classificacao.abstratas.Classificacao;

public class ClassificacaoFactory {
    public static Classificacao criarClassificacao(int codigo){
        switch (codigo) {
            case 0:
                return new Basica();
            case 1:
                return  new Familia();
            case 2:
                return  new Luxo();
            default:
                throw new IllegalArgumentException("O codigo da classificação tem que ser 0, 1 ou 2");
        }
    }
}
