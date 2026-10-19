package pps;

import java.util.List;

public class Usuario {
    private String username;
    private String senha;
    private List<Transacao> transacoes;

    public Usuario(String username, String senha){
        this.username = username;
        this.senha = senha;
    }

    public void addTransacao(Transacao trans){
        this.transacoes.add(trans);
    }

    public String getUsername(){
        return this.username;
    }

    public String getSenha(){
        return this.senha;
    }

    @Override
    public String toString(){
        return this.username;
    }
}
