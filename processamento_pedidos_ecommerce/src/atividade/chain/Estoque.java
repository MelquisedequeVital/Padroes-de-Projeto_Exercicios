package atividade.chain;

import atividade.Pedido;

public class Estoque extends ProcessamentoPedido{

    @Override 
    public void processar(Pedido pedido){
        System.out.println("Verificando estoque...");
        if (pedido.isPedidoEmEstoque()) {
            System.out.println("Estoque confirmado.");
            super.processar(pedido);
        } else {
            System.out.println("Pedido cancelado: Produto fora de estoque.");
        }
    }
}
