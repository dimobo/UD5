

//�rea de imports
import javax.swing.JOptionPane;

public class Ejercicio04APP {
	public static void main(String[] args) {

		// Esta variable nos pedir� el radio des de un jpanel.
		double num = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo."));
		
		// Esta l�nea nos mandar� el �rea del c�rculo junto a un texto
		JOptionPane.showMessageDialog(null, "El �rea del circulo es: " + (Math.PI * Math.pow(num, 2)));

	}
}
