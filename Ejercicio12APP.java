

import javax.swing.JOptionPane;

public class Ejercicio12APP {
	public static void main(String[] args) {

		String passw1 = "ReusCamp", passw2 = "";

		// i en este caso representa los intentos restantes y en la condici�n del for
		// tendremos que mientras sea superior a 0 nos deje seguir intentando, aqu�
		// podr�amos a�adir tambi�n la condici�n para cerrar el bucle en caso de que la
		// contrase�a coincida, pero he decidido que lo cerrar� con un break.
		for (int i = 3; i > 0; i--) {

			passw2 = JOptionPane.showInputDialog("Introduce la contrase�a. \nIntentos restantes:  " + (i));

			// Este if est� mirando si passw2 (introducida por el usuario) coincide con la
			// ya establecida, si es el caso saldr� el mensaje de enhorabuena y en cerrarlo
			// se cerrar� el bucle.
			if (passw2.equals(passw1)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
			}
		}

	}
}
