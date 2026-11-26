package turing;

public class Halt implements EstadoMaquina{
    public boolean processar(Maquina maq){
        System.out.println(maq.getPassos());
        return false;
    }
}
