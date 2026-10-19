package semaforo.estados;

import semaforo.Semaforo;

public abstract class EstadoSemaforo {
    protected int tempo;

    public EstadoSemaforo(int tempo){
        this.tempo = tempo;
    }

    public abstract void exibir();

    public abstract void mostrarSinal(Semaforo semaforo);

    public void efetuarTransicao(Semaforo semaforo, EstadoSemaforo estado) {
        semaforo.setEstado(estado);
    }

    public void showVisorRegressivo(int tempo) {
        for (int i = tempo; i > 0; i--) {
            System.out.println(i + " segundo(s)");
            try {
                // 1000 milisegundos equivale a 1 segundo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };

    public int getTempo(){
        return this.tempo;
    }
}
