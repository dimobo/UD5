

import javax.swing.JOptionPane;

public class Ejercicio11APP {
	public static void main(String[] args) {

		// En este programa pedimos al usuario que introduzca un dia de la semana
		// (String) y el programa dirá si es un día laboral (Lunes / Sábado) o si no lo
		// es (Domingo) gracias a la estructura Switch que hemos realizado

		String dia = JOptionPane.showInputDialog("Introduce el número de ventas.");

		switch (dia) {
		case "Lunes":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "Miércoles":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "Sábado":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null, "Hoy no es un día laboral");
			break;
		case "lunes":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "miércoles":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "sábado":
			JOptionPane.showMessageDialog(null, "Hoy es un día laboral");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "Hoy no es un día laboral");
			break;

		default:
			JOptionPane.showMessageDialog(null, "No has introducido un día correcto.");
			break;
		}

	}
}
