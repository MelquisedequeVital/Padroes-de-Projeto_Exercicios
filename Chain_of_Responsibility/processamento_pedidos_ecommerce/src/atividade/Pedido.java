package atividade;

public class Pedido {
    private boolean pedidoEmEstoque;
    private boolean freteCalculado;
    private boolean descontoAplicado;
    private boolean pagamentoRealizado;
    private double valorDoPedido = 0.0;
    

    public Pedido(double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
    }

    public boolean isPedidoEmEstoque() {
        return pedidoEmEstoque;
    }
    public void setPedidoEmEstoque(boolean pedidoEmEstoque) {
        this.pedidoEmEstoque = pedidoEmEstoque;
    }
    public boolean isFreteCalculado() {
        return freteCalculado;
    }
    public void setFreteCalculado(boolean freteCalculado) {
        this.freteCalculado = freteCalculado;
    }
    public boolean isDescontoAplicado() {
        return descontoAplicado;
    }
    public void setDescontoAplicado(boolean descontoAplicado) {
        this.descontoAplicado = descontoAplicado;
    }
    public boolean isPagamentoRealizado() {
        return pagamentoRealizado;
    }
    public void setPagamentoRealizado(boolean pagamentoRealizado) {
        this.pagamentoRealizado = pagamentoRealizado;
    }
    public double getValorDoPedido() {
        return valorDoPedido;
    }
    public void setValorDoPedido(double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
    }

    
}
