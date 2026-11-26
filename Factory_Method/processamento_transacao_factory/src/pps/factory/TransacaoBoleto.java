package pps.factory;

import pps.factory.pagamento.Boleto;
import pps.factory.pagamento.Pagamento;

public class TransacaoBoleto extends Transacao {

    @Override
    public Pagamento criarFormaPagamento() {
       return new Boleto();
    }

}
