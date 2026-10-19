package pps.transacao_chain;

import pps.Transacao;

public class ValidacaoDadosTransacao extends TransacaoHandler{

    @Override
    public void processar(Transacao trans){
        if(transacaoEValida(trans)){
            System.out.println("Transação validada de " + trans.getPagador() + " para " + trans.getRecebedor());
            super.processar(trans);
        } else {
            System.out.println("Dados de transacao invalidos");
            return;
        }
    }

    private boolean transacaoEValida(Transacao trans){
        //logica aqui
        return true;
    }

}
