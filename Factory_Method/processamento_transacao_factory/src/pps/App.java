package pps;

import pps.factory.Transacao;
import pps.factory.TransacaoBoleto;
import pps.factory.TransacaoCredito;
import pps.factory.TransacaoPix;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Transacao com Boleto");
        System.out.println();
        
        Transacao trans = new TransacaoBoleto();

        trans.processar();


        System.out.println();
        System.out.println("Transacao com Pix");
        System.out.println();


        trans = new TransacaoPix();

        trans.processar();


        System.out.println();
        System.out.println("Transacao com Cartao de Credito");
        System.out.println();

        trans = new TransacaoCredito();

        trans.processar();
        
    }
}
