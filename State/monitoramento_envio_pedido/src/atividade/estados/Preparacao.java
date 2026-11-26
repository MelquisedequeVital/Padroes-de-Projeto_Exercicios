package atividade.estados;

import atividade.Pedido;

public class Preparacao extends EstadoPedido{

    @Override 
    public void acompanharPedido(){
        System.out.println("Pedido em estado de preparação");
    };


    @Override 
    public void avançarEstado(Pedido pedido){
        mudarEstado(new TransportadoraEstado(), pedido);
    };
}
