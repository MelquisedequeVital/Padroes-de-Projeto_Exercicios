package pps.cedulas;

public  class Cedula {
    protected Cedula prox;
    private int valor;

    public Cedula(int  valor){
        this.valor = valor;
    }

    public Cedula setProx(Cedula cedula){
        this.prox = cedula;
        return prox;
    }

    public void dispensarCedula(double valor){
        int resto = (int) valor % this.valor;

        int quociente = (int) (valor / this.valor);

        System.out.println("Dispensando " + quociente + " cédulas de R$ " + this.valor);

        if(resto == 0){
            return;
        }

        dispensarProximaCedula(resto);

    };

    private void dispensarProximaCedula(double valor){
        if(prox == null){
            return;
        }
        prox.dispensarCedula(valor);
    }
}
