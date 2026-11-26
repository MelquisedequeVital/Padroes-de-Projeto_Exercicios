package locadora.refactoringExtrato;

public abstract class GeradorExtrato{
    protected final String fimDeLinha = System.getProperty("line.separator");
    public abstract String gerarExtrato(Cliente cliente);
}
