package atividade;

import atividade.chain.Descontos;
import atividade.chain.Estoque;
import atividade.chain.Frete;
import atividade.chain.Pagamento;
import atividade.chain.ProcessamentoPedido;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido(20);
        pedido.setPedidoEmEstoque(true);

        ProcessamentoPedido pipeline = new Estoque();
        pipeline.setProx(new Frete())
                .setProx(new Descontos())
                .setProx(new Pagamento());


        pipeline.processar(pedido);
    }
}
