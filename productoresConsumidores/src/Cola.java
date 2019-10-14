import java.util.ArrayList;

public class Cola {

	private int maxelementos;
	private ArrayList<Integer> cola;

	public Cola(int max) {
		this.cola = new ArrayList<Integer>();
		this.maxelementos = max;
	}

	synchronized public void encolar() {

		if (this.cola.size() == maxelementos) {
			System.out.println("Lleno");
			try {
				Thread.sleep(numeroAleatorio());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			int numeroaleatorio = numeroAleatorio();
			this.cola.add(numeroaleatorio);
			System.out.println("Hemos puesto el número: " + numeroaleatorio);
		}

	}

	synchronized public void desencolar() {
		if (this.cola.size() > 0) {
			int n = this.cola.remove(this.cola.size() - 1);
			System.out.println("hemos quitado el número: " + n);
		} else {
			System.out.println("Vacío");
			try {
				Thread.sleep(numeroAleatorio());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void ver() {
		for (int i = 0; i < cola.size(); i++) {
			System.out.println(i);
		}
	}

	public int numeroAleatorio() {
		return (int) (Math.random() * 100);
	}
}
