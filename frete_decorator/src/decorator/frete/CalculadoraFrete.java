package decorator.frete;

import decorator.AjustePedido;
import model.interfaces.Pedido;

public abstract class CalculadoraFrete extends AjustePedido {

    public CalculadoraFrete(Pedido pedido) {
        super(pedido);
    }

    public abstract double calcularValorFrete();

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() + calcularValorFrete();
    }
}