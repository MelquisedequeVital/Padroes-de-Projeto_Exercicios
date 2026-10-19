package pps;

public class Transacao {
    private Usuario pagador;
    private Usuario recebedor;
    private double valor;


    public Transacao(Usuario pagador, Usuario recebedor, double valor) {
        this.pagador = pagador;
        this.recebedor = recebedor;
        this.valor = valor;
    }


    public Usuario getPagador() {
        return pagador;
    }
    public void setPagador(Usuario pagador) {
        this.pagador = pagador;
    }
    public Usuario getRecebedor() {
        return recebedor;
    }
    public void setRecebedor(Usuario recebedor) {
        this.recebedor = recebedor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }



}
