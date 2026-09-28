package decorator;

import model.interfaces.Pedido;

public class AjustePedido implements Pedido {
    private Pedido pedido;

    public AjustePedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public double calcularPrecoFinal() {
        return this.pedido.calcularPrecoFinal();
    }
}
