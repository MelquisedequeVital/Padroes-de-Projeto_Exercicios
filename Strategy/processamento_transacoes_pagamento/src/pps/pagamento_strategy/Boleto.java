package pps.pagamento_strategy;

import pps.Transacao;

public class Boleto implements FormaDePagamento{

    @Override
    public void pagar(Transacao trans){
        System.out.println("Pagamento realizado com boleto do valor: " + trans.getValor());
    }
}
