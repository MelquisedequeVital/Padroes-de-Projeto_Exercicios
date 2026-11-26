package decorator;

import model.interfaces.Pedido;

public class TaxaEmbalagem extends AjustePedido {
    private double valorAdicional;

    public TaxaEmbalagem(Pedido pedido, double valorAdicional) {
        super(pedido);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() + this.valorAdicional;
    }
}