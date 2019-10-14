public class Principal {

	public static void main(String[] args) {
		int total = 0;
		if (args.length < 1 || args.length > 5) {
			System.out.println("Debes pasar entre 1 y 5 par�metros");

		} else {
			Secundaria[] hilos = new Secundaria[args.length];
			for (int i = 0; i < args.length; i++) {

				try {
					hilos[i] = new Secundaria(args[i]);
					hilos[i].start();
					hilos[i].join();
					total += hilos[i].getTotal();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println(total);
		}
	}

}
