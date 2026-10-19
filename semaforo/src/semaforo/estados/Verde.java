package semaforo.estados;

import semaforo.Semaforo;

public class Verde extends EstadoSemaforo{
    
    public Verde(){
        super(3);
    }

    @Override
    public void exibir(){
        System.out.println(" vermelho  (   )"  );
		System.out.println(" amarelo   (   )");
		System.out.println(" verde     ( X )" );
    }

    @Override
    public void mostrarSinal(Semaforo semaforo){
        exibir();
        showVisorRegressivo(tempo);
        efetuarTransicao(semaforo, new Amarelo());
    }

    @Override
    public String toString(){
        return "Verde";
    }

    
}
