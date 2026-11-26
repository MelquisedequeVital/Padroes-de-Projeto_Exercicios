package pps.factory.pagamento;

public class Boleto implements Pagamento{
    public void pagar(){
        System.out.println("Pagamento realizado com Boleto");
    }
}
