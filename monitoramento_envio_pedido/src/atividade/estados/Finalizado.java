package atividade.estados;

import atividade.Pedido;

public class Finalizado extends EstadoPedido{

    @Override 
    public void acompanharPedido(){
        System.out.println("Pedido finalizado com sucesso");
    }

    @Override
    public void avançarEstado(Pedido pedido) {
        System.out.println("Pedido já finalizado, não é possivel avançar");
    };
}
