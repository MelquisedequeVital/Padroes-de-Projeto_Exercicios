package decorator;

import model.interfaces.Pedido;

public class CupomDesconto extends AjustePedido {
    private double porcentagem;

    public CupomDesconto(Pedido pedido, double porcentagem) {
        super(pedido);
        this.porcentagem = porcentagem;
    }

    @Override
    public double calcularPrecoFinal() {
        double valorBase = super.calcularPrecoFinal();
        return valorBase - (valorBase * this.porcentagem);
    }
}