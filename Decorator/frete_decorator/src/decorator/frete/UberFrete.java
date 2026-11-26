package decorator.frete;

import model.interfaces.Pedido;

public class UberFrete extends CalculadoraFrete {
    private double taxaBase;

    public UberFrete(Pedido pedido, double taxaBase) {
        super(pedido);
        this.taxaBase = taxaBase;
    }

    public UberFrete(Pedido pedido) {
        this(pedido, 20.0);
    }

    @Override
    public double calcularValorFrete() {
        return this.taxaBase;
    }
}
