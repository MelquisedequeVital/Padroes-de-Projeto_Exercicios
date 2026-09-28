package decorator.frete;

import model.interfaces.Pedido;

public class SedexFrete extends CalculadoraFrete {
    private double valorFixo;

    public SedexFrete(Pedido pedido, double valorFixo) {
        super(pedido);
        this.valorFixo = valorFixo;
    }

    @Override
    public double calcularValorFrete() {
        return this.valorFixo;
    }
}