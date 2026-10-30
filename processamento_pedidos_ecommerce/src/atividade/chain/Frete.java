package atividade.chain;

import atividade.Pedido;

public class Frete extends ProcessamentoPedido{
    
    @Override 
    public void processar(Pedido pedido){
        System.out.println("Calculando frete...");
        pedido.setValorDoPedido(pedido.getValorDoPedido() + 10);
        pedido.setFreteCalculado(true);
        super.processar(pedido);
    }
}
