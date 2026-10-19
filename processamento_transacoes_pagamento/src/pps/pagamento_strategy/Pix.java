package pps.pagamento_strategy;

import pps.Transacao;

public class Pix implements FormaDePagamento{

    @Override
    public void pagar(Transacao trans){
        System.out.println("Pagamento realizado com pix do valor: " + trans.getValor());
    }
}
