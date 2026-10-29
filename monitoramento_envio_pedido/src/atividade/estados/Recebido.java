package atividade.estados;

import atividade.Pedido;

public class Recebido extends EstadoPedido {

    @Override 
     public void acompanharPedido(){
        System.out.println("Pedido recebido a espera de confirmação");
     };

    @Override 
    public void confirmarPedido(boolean confirmacao, Pedido pedido){
        if(confirmacao){
            System.out.println("Pedido confirmado");
            mudarEstado(new Finalizado(), pedido);
        } else {
            System.out.println("Pedido não recebido");
            mudarEstado(new Preparacao(), pedido);
        }
    };

    @Override 
    public void avançarEstado(Pedido pedido){
        System.out.println("À espera de confirmação do cliente, não é possivel avançar");
    };
}
