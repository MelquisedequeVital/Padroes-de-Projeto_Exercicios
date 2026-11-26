package pps.factory;

import pps.factory.pagamento.Pagamento;

public abstract class Transacao {

    public void processar() {
        validacao();
        autenticacao();
        pagamento();
        recibo();
    }

    public void validacao() {
        System.out.println("Transação Validada");
    }

    public void autenticacao() {
        System.out.println("Usuario autenticado");
    }

    public void pagamento() {
        Pagamento p = criarFormaPagamento();
        p.pagar();
    }

    public void recibo() {
        System.out.println("Recibo Enviado");
    }

    public abstract Pagamento criarFormaPagamento();

}
