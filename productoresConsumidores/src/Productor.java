
public class Productor extends Thread {

	private Cola cola;

	public Productor(Cola c) {
		this.cola = c;
	}
	
	public void run() {
		this.cola.encolar();
	}

}
