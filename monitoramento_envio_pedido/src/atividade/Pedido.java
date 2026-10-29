package atividade;

import atividade.estados.EstadoPedido;
import atividade.estados.Preparacao;

public class Pedido {
    private double preco;
    private EstadoPedido estado;

    public Pedido(double preco){
        this.preco = preco;
        this.estado = new Preparacao();
    }

    public void setEstado(EstadoPedido estado){
        this.estado = estado;
    }

    public void confirmarPedido(boolean confirmacao){
        estado.confirmarPedido(confirmacao, this);
    }

    public void avançarEstado(){
        estado.avançarEstado(this);
    }

    public void acompanharPedido(){
        estado.acompanharPedido();
    }

}
