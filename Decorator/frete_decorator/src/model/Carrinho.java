package model;

import java.util.ArrayList;
import java.util.List;

import model.interfaces.Pedido;

public class Carrinho implements Pedido {
    private List<Produto> itens;

    public Carrinho(List<Produto> itens) {
        this.itens = (itens != null) ? itens : new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.itens.add(produto);
    }

    public List<Produto> getItens() {
        return itens;
    }

    @Override
    public double calcularPrecoFinal() {
        double subtotal = 0.0;
        for (Produto produto : itens) {
            subtotal += produto.getPreco();
        }
        return subtotal;
    }
}