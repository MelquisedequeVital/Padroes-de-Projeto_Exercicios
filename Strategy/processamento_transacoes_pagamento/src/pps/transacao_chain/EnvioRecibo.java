package pps.transacao_chain;

import pps.Transacao;

public class EnvioRecibo extends TransacaoHandler{

    @Override
    public void processar(Transacao trans){
        System.out.println("Recibo enviado para o usuário");
    }
}
