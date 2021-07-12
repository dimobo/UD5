

import javax.swing.JOptionPane;

public class Ejercicio12APP {
	public static void main(String[] args) {

		String passw1 = "ReusCamp", passw2 = "";

		// i en este caso representa los intentos restantes y en la condición del for
		// tendremos que mientras sea superior a 0 nos deje seguir intentando, aquí
		// podríamos añadir también la condición para cerrar el bucle en caso de que la
		// contraseña coincida, pero he decidido que lo cerraré con un break.
		for (int i = 3; i > 0; i--) {

			passw2 = JOptionPane.showInputDialog("Introduce la contraseña. \nIntentos restantes:  " + (i));

			// Este if está mirando si passw2 (introducida por el usuario) coincide con la
			// ya establecida, si es el caso saldrá el mensaje de enhorabuena y en cerrarlo
			// se cerrará el bucle.
			if (passw2.equals(passw1)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
			}
		}

	}
}
