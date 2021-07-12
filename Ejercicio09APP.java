package code;

public class Ejercicio9APP {
	public static void main(String[] args) {

		// He usado un bucle for porque me parece mejor teniendo en cuenta que usaremos
		// un a variable que sé ira incrementando en cada iteración del bucle.
		for (int i = 1; i <= 100; i++) {

			// Este if nos está comprobando si el resto de los números es 0 al dividirlo
			// entre 2 y entre 3 y en caso de que lo sea lo imprime por pantalla.
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
			}

		}

	}
}
