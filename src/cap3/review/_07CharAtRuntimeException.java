package cap3.review;

/**
 * Muestra que si en charAt se especifica un índice fuera de rango, da un error
 * en tiempo de ejecución. No da error de compilación.
 * 
 * @author Chris
 * @since 11/12/2018
 */
public class _07CharAtRuntimeException {

	public static void main(String[] args) {
		String letters = "abcdef";
		System.out.println(letters.length()); // imprime 6
		System.out.println(letters.charAt(3)); // imprime d
		System.out.println(letters.charAt(6)); // StringIndexOutOfBoundsException: 
	}

}
