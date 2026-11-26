package pps.transacao_chain;

import pps.Transacao;
import pps.pagamento_strategy.FormaDePagamento;

public class ProcessamentoPagamento extends TransacaoHandler{

    private FormaDePagamento formaPagamento;

    public ProcessamentoPagamento(FormaDePagamento formaPagamento){
        this.formaPagamento = formaPagamento;
    }

    @Override
    public void processar(Transacao trans){
        this.formaPagamento.pagar(trans);
        super.processar(trans);
    }
}
