package pps.factory;

import pps.factory.pagamento.CartaoDeCredito;
import pps.factory.pagamento.Pagamento;

public class TransacaoCredito extends Transacao{

    @Override
    public Pagamento criarFormaPagamento() {
        return new CartaoDeCredito();
    }

}
