

import javax.swing.JOptionPane;

public class Ejercicio11APP {
	public static void main(String[] args) {

		// En este programa pedimos al usuario que introduzca un dia de la semana
		// (String) y el programa dir� si es un d�a laboral (Lunes / S�bado) o si no lo
		// es (Domingo) gracias a la estructura Switch que hemos realizado

		String dia = JOptionPane.showInputDialog("Introduce el n�mero de ventas.");

		switch (dia) {
		case "Lunes":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "Mi�rcoles":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "S�bado":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null, "Hoy no es un d�a laboral");
			break;
		case "lunes":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "mi�rcoles":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "s�bado":
			JOptionPane.showMessageDialog(null, "Hoy es un d�a laboral");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "Hoy no es un d�a laboral");
			break;

		default:
			JOptionPane.showMessageDialog(null, "No has introducido un d�a correcto.");
			break;
		}

	}
}
