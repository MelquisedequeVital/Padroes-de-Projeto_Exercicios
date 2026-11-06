package pps;

import pps.cedulas.Cedula;

public class App {
    public static void main(String[] args) throws Exception {
        ATM atm = new ATM();
        Cedula cedulas = new Cedula(50);
        cedulas.setProx(new Cedula(20))
                .setProx(new Cedula(10));
        atm.setCedulas(cedulas);

        atm.retirarDinheiro(230);
    }
}
