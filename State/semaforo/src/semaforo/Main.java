package semaforo;

public class Main {

	public static void main(String[] args) {
		Semaforo epitacio = new Semaforo("12356");
		epitacio.start();
		System.out.println("Fim da simulacao.");
	}

}
