package code;

import javax.swing.JOptionPane;

public class Ejercicio10APP {
	public static void main(String[] args) {

		// En esta zona declaramos las variables.
		int numVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero de ventas."));
		double ven = 0.0, venTotal = 0.0;

		// Aunque en un principio este bucle lo podr�amos hacer funcionar sin la
		// variable i he decidido crearla para poder indicar porque venta vamos.
		for (int i = 1; i <= numVentas; i++) {

			// En estas l�neas estamos pidiendo que nos indiquen al valor de la venta y
			// luego sumando el total que ya ten�amos (empezando por 0.0) al valor indicado.
			ven = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de la venta " + i));
			venTotal = venTotal + ven;

		}

		// Aqu� simplemente mostramos por pantalla el valor final de las ventas,
		// formateado para solo mostrar 2 decimales.
		JOptionPane.showMessageDialog(null, String.format("La suma de las ventas es:  %.2f", venTotal));
	}
}
