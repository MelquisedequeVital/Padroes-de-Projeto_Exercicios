package semaforo.estados;

import semaforo.Semaforo;

public class Amarelo extends EstadoSemaforo {
    
    public Amarelo(){
        super(1);
    }

    @Override
    public void exibir(){
        System.out.println(" vermelho  (   )"  );
		System.out.println(" amarelo   ( X )");
		System.out.println(" verde     (   )" );
    }

    @Override
    public void mostrarSinal(Semaforo semaforo){
        exibir();
        showVisorRegressivo(tempo);
        efetuarTransicao(semaforo, new Vermelho());
    }

    @Override
    public String toString(){
        return "Amarelo";
    }
}
