package pps.pagamento_strategy;

import pps.Transacao;

public interface FormaDePagamento {
    public void pagar(Transacao trans);
}
