package pps.factory;

import pps.factory.pagamento.Pagamento;
import pps.factory.pagamento.Pix;

public class TransacaoPix extends Transacao {

    @Override 
    public Pagamento criarFormaPagamento(){
        return new Pix();
    }
}
