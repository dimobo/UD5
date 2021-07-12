

//Área de imports
import javax.swing.JOptionPane;

public class Ejercicio05APP {
	public static void main(String[] args) {

		// Esta variable nos pedirá el radio des de un jpanel.
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo."));

		// La siguiente estructura if nos comprobará si el número es divisible entre 2
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, num + " es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, num + " no es divisible entre 2");
		}

	}
}
