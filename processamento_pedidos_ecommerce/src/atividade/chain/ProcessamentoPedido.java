package atividade.chain;

import atividade.Pedido;

public abstract class ProcessamentoPedido {

    private ProcessamentoPedido prox;

    public ProcessamentoPedido setProx(ProcessamentoPedido prox){
        this.prox = prox;
        return prox;
    }

    public void processar(Pedido pedido){
        if(prox != null){
              prox.processar(pedido);
        } else {
            return;
        }
      
    };


}
