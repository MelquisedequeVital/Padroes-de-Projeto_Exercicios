package chain;

import chain.suporte.SuporteHardware;
import chain.suporte.SuporteRede;
import chain.suporte.SuporteSoftware;
import chain.suporte.SuporteTI;
import chain.suporte.SuporteTecnico;

public class Main {
    public static void main(String[] args) throws Exception {
        SuporteTecnico suporte = new SuporteHardware();
        suporte.setProx(new SuporteRede())
                .setProx(new SuporteSoftware())
                .setProx(new SuporteTI());

        Chamado cham = new Chamado("PC não liga", "hardware");
        Chamado cham1 = new Chamado("Internet caiu", "rede");
        Chamado cham2 = new Chamado("Aplicação fora do ar", "software");
        Chamado cham3 = new Chamado("O datacenter ta pegando fogo", "bombeiros");

        suporte.responderChamado(cham);
        System.out.println();
        suporte.responderChamado(cham1);
        System.out.println();
        suporte.responderChamado(cham2);
        System.out.println();
        suporte.responderChamado(cham3);
        
        

    }
}
