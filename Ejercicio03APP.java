

//�rea de imports
import javax.swing.JOptionPane;

public class Ejercicio03APP {
	public static void main(String[] args) {

		// Esta variable nos pedir� el nombre des de un jpanel.
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre.");

		// Esta l�nea generar� un panel con un mensaje de bienvenida y nuestro nombre.
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}
}
