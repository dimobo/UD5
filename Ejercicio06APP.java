

//Área de imports
import javax.swing.JOptionPane;

public class Ejercicio06APP {
	public static void main(String[] args) {

		// Esta variable nos pedirá el precio des de un jpanel.
		double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto."));
		// La siguiente línea contiene una constante que es el IVA del 21%
		final double IVA = 0.21;

		// Esta línea nos mandará el precio total del producto,
		JOptionPane.showMessageDialog(null, String.format("El precio del producto es: %.2f", (num + (num * IVA))));

	}
}
