package chain.suporte;

import chain.Chamado;

public class SuporteHardware extends SuporteTecnicoHandler {

    @Override
    public void responderChamado(Chamado cham){
        if(cham.getSuporte().toLowerCase().equals("hardware")){
            System.out.println("Suporte de Hardware\n Olá! sou Victor e vou iniciar o seu atendimento para:\n" + cham.getProblema());  
            return;
        }

        super.responderChamado(cham);
    }
}
