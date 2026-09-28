import java.util.ArrayList;
import java.util.List;

import decorator.CupomDesconto;
import decorator.TaxaEmbalagem;
import decorator.frete.UberFrete;
import model.Carrinho;
import model.Produto;
import model.interfaces.Pedido;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("1", "Teclado Mecânico", 250.00));
        listaProdutos.add(new Produto("2", "Mouse Gamer", 150.00));

        // Subtotal dos itens
        Pedido carrinho = new Carrinho(listaProdutos);
        System.out.println("Subtotal Carrinho: R$ " + carrinho.calcularPrecoFinal());

        // Adiciona o Frete
        Pedido pedidoComFrete = new UberFrete(carrinho, 25.00);
        System.out.println("Com Frete Uber: R$ " + pedidoComFrete.calcularPrecoFinal());

        // Adiciona 10% de desconto sobre o acumulado
        Pedido pedidoComDesconto = new CupomDesconto(pedidoComFrete, 0.10);
        System.out.println("Com Desconto de 10%: R$ " + pedidoComDesconto.calcularPrecoFinal());

        // Adiciona taxa de embalagem de presente
        Pedido pedidoFinal = new TaxaEmbalagem(pedidoComDesconto, 15.00);
        System.out.println("Total Final com Embalagem: R$ " + pedidoFinal.calcularPrecoFinal());
    }
}
