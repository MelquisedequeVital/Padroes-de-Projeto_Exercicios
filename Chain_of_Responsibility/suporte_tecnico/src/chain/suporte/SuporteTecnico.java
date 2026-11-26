package chain.suporte;

import chain.Chamado;

public interface SuporteTecnico {
    public void responderChamado(Chamado chamado);

    public SuporteTecnico setProx(SuporteTecnico sup);
}
