package atividade.estados;

import atividade.Pedido;

public abstract class EstadoPedido {
    
    protected  void mudarEstado(EstadoPedido estado, Pedido pedido){
        pedido.setEstado(estado);
    }

    public abstract void acompanharPedido();

    public void confirmarPedido(boolean confirmacao, Pedido pedido){
        System.out.println("Não é possivel confirmar nesta etapa");
    };

    public abstract void avançarEstado(Pedido pedido);
}
