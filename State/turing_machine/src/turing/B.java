package turing;

public class B implements EstadoMaquina {
    public boolean processar(Maquina maq){
        boolean valor = !maq.getValorAtual();
        if(valor){
            maq.escreverNaFita(true);;
            maq.moverParaEsquerda();
            maq.addPasso();
            maq.setEstado(new A());
        } else{
            maq.escreverNaFita(true);
            maq.moverParaDireita();
            maq.addPasso();
            maq.setEstado(new Halt());;
        }

        return true;

    }
}
