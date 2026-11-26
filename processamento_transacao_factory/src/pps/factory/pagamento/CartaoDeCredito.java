package pps.factory.pagamento;

public class CartaoDeCredito implements Pagamento {
    public void pagar(){
        System.out.println("Pagamento realizado com Cartao de Credito");
    }
}
