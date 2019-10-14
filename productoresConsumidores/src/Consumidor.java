
public class Consumidor extends Thread {

	private Cola cola;

	public Consumidor(Cola c) {
		this.cola = c;
	}
	
	public void run() {
		this.cola.desencolar();
	}
}
