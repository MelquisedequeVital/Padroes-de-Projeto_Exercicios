package chain.suporte;

import chain.Chamado;

public class SuporteSoftware extends SuporteTecnicoHandler {

    @Override
    public void responderChamado(Chamado cham){
        if(cham.getSuporte().toLowerCase().equals("software")){
            System.out.println("Suporte de Software\n Olá! sou Alex e vou iniciar o seu atendimento para:\n" + cham.getProblema());  
            return;
        }
        super.responderChamado(cham);
    }
}
