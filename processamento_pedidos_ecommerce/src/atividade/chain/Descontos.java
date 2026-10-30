package atividade.chain;

import atividade.Pedido;

public class Descontos extends ProcessamentoPedido{

    @Override 
    public void processar(Pedido pedido){
        System.out.println("Verificando descontos...");
        pedido.setValorDoPedido(pedido.getValorDoPedido() - 5);
        pedido.setDescontoAplicado(true);
        super.processar(pedido);
    }
}
