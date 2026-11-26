package atividade;

public class Transportadora {
    private Pedido pedido;
    private String nome;

    public Transportadora(String nome){
        this.nome = nome;
    }

    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public void avançarEstadoPedido(){
        pedido.avançarEstado();
    }

}
