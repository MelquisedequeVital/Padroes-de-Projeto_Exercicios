package atividade;

public class Cliente {
    private String nome;
    private Pedido pedido;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void confirmarPedido(boolean confirmacao){
        this.pedido.confirmarPedido(confirmacao);
    }

    public void acompanharPedido(){
        pedido.acompanharPedido();
    }

    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }
}
