import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Secundaria extends Thread {

	private String ficheroRecibido;
	private int total = 0;

	public String getFicheroRecibido() {
		return ficheroRecibido;
	}

	public void setFicheroRecibidoS(String ficheroRecibido) {
		this.ficheroRecibido = ficheroRecibido;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	// constructor
	public Secundaria(String ficheroQueVoyALeer) {
		this.ficheroRecibido = ficheroQueVoyALeer;
	}

	public void run() {
		File directorio = new File(System.getProperty("user.home"));

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(directorio + File.separator + this.ficheroRecibido));

			String linea = "";

			while ((linea = reader.readLine()) != null) {

				String[] resultado = linea.split("=");
				String c = resultado[0];

				if (c.equals("Venta")) {
					total += Integer.parseInt(resultado[1]);
				} else if (c.equals("Compra")) {
					total -= Integer.parseInt(resultado[1]);
				}

			}

			reader.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
