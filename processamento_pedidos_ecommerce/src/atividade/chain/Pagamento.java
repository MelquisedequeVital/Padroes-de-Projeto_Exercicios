package atividade.chain;

import atividade.Pedido;

public class Pagamento extends ProcessamentoPedido{

    @Override 
    public void processar(Pedido pedido){
        System.out.println("Processando pagamento...");
        pedido.setPagamentoRealizado(true);
        System.out.println("Pagamento de R$ " + pedido.getValorDoPedido() + " aprovado!");
        System.out.println("SUCESSO: O pedido foi processado e realizado com sucesso!");
        super.processar(pedido);
    }
}
