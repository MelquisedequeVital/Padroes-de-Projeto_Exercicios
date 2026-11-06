package pps;

import pps.cedulas.Cedula;

public class ATM {

    private Cedula cedulas;


    public ATM(){}

    public void setCedulas(Cedula cedula){
        this.cedulas = cedula;
    }


    public void retirarDinheiro(double valor){

        if(valor % 10 != 0){
            System.out.println("O valor tem que ser divisível por 10");
            return;
        }

        this.cedulas.dispensarCedula(valor);
    }
}
