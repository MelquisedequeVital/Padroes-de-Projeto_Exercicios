package pps.transacao_chain;

import pps.Transacao;
import pps.Usuario;

public class AutenticacaoUsuario extends TransacaoHandler{

    @Override
    public void processar(Transacao trans){
        if(usuarioEstaAutenticado(trans.getPagador())){
            System.out.println("Usuario está autenticado");
            super.processar(trans);
        } else {
            System.out.println("Usuario não autenticado");
            return;
        }
    }

    private boolean usuarioEstaAutenticado(Usuario usuario){
        //logica aqui
        return true;
    }
}
