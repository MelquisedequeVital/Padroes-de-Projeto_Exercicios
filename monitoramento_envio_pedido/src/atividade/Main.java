package atividade;

public class Main {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido(20.00);
        Cliente cliente = new Cliente("Melqui");
        Transportadora transportadora = new Transportadora("Correios");

        cliente.setPedido(pedido);
        transportadora.setPedido(pedido);

        cliente.acompanharPedido();
        transportadora.avançarEstadoPedido();
        cliente.acompanharPedido();
        transportadora.avançarEstadoPedido();
        cliente.acompanharPedido();
        cliente.confirmarPedido(true);
        cliente.acompanharPedido();
    }
}
