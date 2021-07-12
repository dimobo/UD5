package code;

public class Ejercicio01APP {
	public static void main(String[] args) {

		/*
		 * Vamos a usar el método que hemos generado para comparar números unas cuantas
		 * veces para comprobar que realmente funciona.
		 */

		compararNumeros(11, 14);
		compararNumeros(15, 4);
		compararNumeros(4, 4);
		compararNumeros(10, 120);
		compararNumeros(400, 400);
		compararNumeros(1539, 144);

	}

	/*
	 * He generado este nuevo método que será el encargado de comparar los números,
	 * lo he generado porque de esta forma podemos realizar varias pruebas sin tener
	 * que repetir código.
	 */
	public static void compararNumeros(int num1, int num2) {

		/*
		 * Las siguientes líneas de código compararán los números y nos dirán por
		 * consola cuál de los dos es mayor o que son iguales en caso de empate.
		 */

		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println("Los dos números son iguales");
		}

	}
}
