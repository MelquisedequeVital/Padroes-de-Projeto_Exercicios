package pps;

import pps.pagamento_strategy.CartaoDeCredito;
import pps.transacao_chain.AutenticacaoUsuario;
import pps.transacao_chain.EnvioRecibo;
import pps.transacao_chain.ProcessamentoPagamento;
import pps.transacao_chain.TransacaoHandler;
import pps.transacao_chain.ValidacaoDadosTransacao;

public class Main {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario("melquisedeque", "123");
        Usuario recebedor = new Usuario("Ludmilla", "123");

        Transacao trans = new Transacao(user, recebedor, 300);

        TransacaoHandler pipeline = new ValidacaoDadosTransacao();
        
        pipeline.setProx(new AutenticacaoUsuario())
                .setProx(new ProcessamentoPagamento(new CartaoDeCredito()))
                .setProx(new EnvioRecibo());

        pipeline.processar(trans);
    }
}
