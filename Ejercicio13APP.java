package code;

import javax.swing.JOptionPane;

public class Ejercicio13APP {
	public static void main(String[] args) {

		// Aquí estamos pidiendo al usuario que nos introduzca los operandos y el signo
		// aritmético.
		int op1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el operando 1")),
				op2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el operando 2"));
		String sig = JOptionPane.showInputDialog("Introduce el signo aritmético (+, -, *, /, %, ^)");

		// En la siguiente estructura switch estamos comprobando que es lo que se ha de
		// realizar con los operandos, se realiza y se muestra por un cuadro de diálogo.
		switch (sig) {

		case "+":
			JOptionPane.showMessageDialog(null, op1 + " " + sig + " " + op2 + " = " + (op1 + op2));
			break;

		case "-":
			JOptionPane.showMessageDialog(null, op1 + " " + sig + " " + op2 + " = " + (op1 - op2));
			break;

		case "*":
			JOptionPane.showMessageDialog(null, op1 + " " + sig + " " + op2 + " = " + (op1 * op2));
			break;

		case "/":
			JOptionPane.showMessageDialog(null, op1 + " " + sig + " " + op2 + " = " + (op1 / op2));
			break;

		case "%":
			JOptionPane.showMessageDialog(null, op1 + " " + sig + " " + op2 + " = " + (op1 % op2));
			break;

		case "^":
			JOptionPane.showMessageDialog(null, op1 + " " + sig + " " + op2 + " = " + (Math.pow(op1, op2)));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Uno de los valores introducidos no es valido.");
			break;
		}

	}
}
