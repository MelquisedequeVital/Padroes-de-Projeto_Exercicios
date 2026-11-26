package atividade.estados;

import atividade.Pedido;

public class TransportadoraEstado extends EstadoPedido{
    @Override
     public void acompanharPedido(){
        System.out.println("Pedido pego pela transportadora");
     };



    @Override
    public void avançarEstado(Pedido pedido){
        mudarEstado(new Recebido(), pedido);
    };
}
