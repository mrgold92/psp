public class Main {

	public static void main(String[] args) {

		int tama = 2;

		Cola cola = new Cola(tama);
		Productor productor = null;
		Consumidor consumidor = null;

		int veces = 8;

		for (int i = 0; i < veces; i++) {
			productor = new Productor(cola);
			productor.start();

		}

		for (int i = 0; i < veces; i++) {
			consumidor = new Consumidor(cola);
			consumidor.start();
		}

	}

}
