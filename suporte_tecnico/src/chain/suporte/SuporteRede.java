package chain.suporte;

import chain.Chamado;

public class SuporteRede extends SuporteTecnicoHandler {

    @Override
    public void responderChamado(Chamado cham){
        if(cham.getSuporte().toLowerCase().equals("rede")){
            System.out.println("Suporte de Rede\n Olá! sou Melquisedeque e vou iniciar o seu atendimento para:\n" + cham.getProblema());  
            return;
        }

        super.responderChamado(cham);
    }
}
