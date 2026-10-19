package semaforo.estados;

import semaforo.Semaforo;

public class Vermelho extends EstadoSemaforo{
    
    public Vermelho(){
        super(5);
    }

    @Override
    public void exibir(){
        System.out.println(" vermelho  ( X )"  );
		System.out.println(" amarelo   (   )");
		System.out.println(" verde     (   )" );
    }

    @Override
    public void mostrarSinal(Semaforo semaforo){
        exibir();
        showVisorRegressivo(tempo);
        efetuarTransicao(semaforo, new Verde());
    }

    @Override
    public String toString(){
        return "Vermelho";
    }
}
