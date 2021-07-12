

//Área de imports
import javax.swing.JOptionPane;

public class Ejercicio04APP {
	public static void main(String[] args) {

		// Esta variable nos pedirá el radio des de un jpanel.
		double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo."));
		
		// Esta línea nos mandará el área del círculo junto a un texto
		JOptionPane.showMessageDialog(null, "El área del circulo es: " + (Math.PI * Math.pow(num, 2)));

	}
}
