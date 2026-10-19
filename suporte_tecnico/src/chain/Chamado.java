package chain;

public class Chamado {
    private String problema;
    private String suporte;

    public Chamado(String problema, String suporte){
        this.problema = problema;
        this.suporte = suporte;
    }

    public String getSuporte(){
        return this.suporte;
    }

    public String getProblema(){
        return this.problema;
    }
}
