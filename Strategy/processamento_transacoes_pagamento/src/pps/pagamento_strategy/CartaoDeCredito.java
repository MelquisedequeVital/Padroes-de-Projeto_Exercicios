package pps.pagamento_strategy;

import pps.Transacao;

public class CartaoDeCredito implements FormaDePagamento {

    public CartaoDeCredito(){}

    @Override
    public void pagar(Transacao trans){
        System.out.println("Pagamento realizado com cartao de credito do valor: " + trans.getValor());
    }
}
