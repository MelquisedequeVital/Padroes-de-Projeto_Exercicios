package semaforo;
import java.util.HashMap;
import java.util.Map;

import semaforo.estados.Amarelo;
import semaforo.estados.EstadoSemaforo;
import semaforo.estados.Verde;

import java.lang.Thread;

public class Semaforo {
	
	private String numTombamento = null;

	private EstadoSemaforo estadoSemaforo = new Verde();
	
	public Semaforo(String numTombamento) {
        this.numTombamento = numTombamento;
	}
	
	public String getNumTombamento() {
		return numTombamento;
	}

	public void setNumTombamento(String numTombamento) {
		this.numTombamento = numTombamento;
	}
	
	public void setEstado(EstadoSemaforo estado){
		this.estadoSemaforo = estado;
	}
	
	
	public void start() {
		this.start(1000000);
	}

	public void start(int time_in_seconds) {
		while(time_in_seconds > 0) {
			System.out.println("Tempo restante da simulacao: " + time_in_seconds + " segundos");
			System.out.println( estadoSemaforo.toString() + " : " + estadoSemaforo.getTempo() + " segundos.");
			this.estadoSemaforo.mostrarSinal(this);
			time_in_seconds -= estadoSemaforo.getTempo();
			System.out.println();
			
		}
		
	}
	
	

}
