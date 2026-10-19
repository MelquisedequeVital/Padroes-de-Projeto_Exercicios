package pps.transacao_chain;

import pps.Transacao;

public abstract class TransacaoHandler {
    protected TransacaoHandler prox;

    public void processar(Transacao trans){
        if(prox != null){
            prox.processar(trans);
        }
    }

    public TransacaoHandler setProx(TransacaoHandler handler){
        this.prox = handler;
        return prox;
    }
}
