import java.util.Scanner;

/**
 * @author Pedro Ant�n Gil
 * @version P1.0
 * @since 04/04/2016
 * 
 */
public class Aciertos {

	/**
	 * M�todo principal: genera un n�mero al azar de 0 a 500 y va pidiendo n�meros
	 * al usuario, mostrando la cantidad de intentos cuando logra acertarlo.
	 * Adem�s, muestra tras cada n�mero insertado un mensaje orientativo.
	 * @param args cadena de argumentos
	 */
	public static void main(String[] args) {
	        int cont = 0;
	        int valor = (int) (500 *Math.random());
	        //System.out.print(x);
	        Scanner sc = new Scanner(System.in);
	        compara(cont, valor, sc);

	    }

	/**
	 * M�todo que compara el n�mero introducido por el usuario con el
	 * valor generado aleatoriamente, mostrando indicaciones tras cada intento
	 * y un mensaje final al comprobar que son iguales.
	 * @param cont n�mero para contar los intentos
	 * @param valor n�mero generado por el ordenador
	 * @param sc n�mero introducido por el usuario
	 * @see Aciertos#pideN�mero(Scanner)
	 */
	public static void compara(int cont, int valor, Scanner sc) {
		int n�mero;
		do {
		    n�mero = pideN�mero(sc);
		    if (n�mero > valor) {
		        System.out.print("Te pasaste Amigo");
		    } else if (n�mero < valor){
		        System.out.print("Casi cerca ...");
		    }
		    cont++;
		} while (n�mero != valor);
		System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
	}

	/**
	 * M�todo que imprime por pantalla un mensaje para pedir un n�mero.
	 * @param sc n�mero introducido por el usuario
	 * @return Devuelve el valor int tecleado por el usuario
	 */
	public static int pideN�mero(Scanner sc) {
		int n�mero;
		System.out.print("\nIntroduce el valor de X: ");
		n�mero = sc.nextInt();
		return n�mero;
	}
	}
