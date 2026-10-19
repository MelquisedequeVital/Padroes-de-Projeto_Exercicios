package chain.suporte;

import chain.Chamado;

public abstract class SuporteTecnicoHandler implements SuporteTecnico{

    protected SuporteTecnico prox;

    public void responderChamado(Chamado chamado){
        if(prox != null){
            prox.responderChamado(chamado);
        }
    };

    public SuporteTecnico setProx(SuporteTecnico sup){
        this.prox = sup;
        return prox;
    };

}
