package turing;

public class A implements EstadoMaquina{
    public boolean processar(Maquina maq){
        if(!maq.getValorAtual()){
            maq.escreverNaFita(true);;
            maq.moverParaDireita();
        } else{
            maq.escreverNaFita(true);
            maq.moverParaEsquerda();
        }

        maq.setEstado(new B());
        maq.addPasso();
        
        return true;
    }
}
