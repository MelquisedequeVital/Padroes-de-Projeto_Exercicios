package chain.suporte;

import chain.Chamado;

public class SuporteTI extends SuporteTecnicoHandler{

    @Override
    public void responderChamado(Chamado cham){
        System.out.println("Suporte de TI Geral\n Olá! sou Fred e vou iniciar o seu atendimento para:\n" + cham.getProblema());  
    }
}
