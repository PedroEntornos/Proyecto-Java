import java.util.Scanner;

/**
 * @author Pedro Antón Gil
 * @version P1.0
 * @since 04/04/2016
 * 
 */
public class Aciertos {

	/**
	 * Método principal: genera un número al azar de 0 a 500 y va pidiendo números
	 * al usuario, mostrando la cantidad de intentos cuando logra acertarlo.
	 * Además, muestra tras cada número insertado un mensaje orientativo.
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
	 * Método que compara el número introducido por el usuario con el
	 * valor generado aleatoriamente, mostrando indicaciones tras cada intento
	 * y un mensaje final al comprobar que son iguales.
	 * @param cont número para contar los intentos
	 * @param valor número generado por el ordenador
	 * @param sc número introducido por el usuario
	 * @see Aciertos#pideNúmero(Scanner)
	 */
	public static void compara(int cont, int valor, Scanner sc) {
		int número;
		do {
		    número = pideNúmero(sc);
		    if (número > valor) {
		        System.out.print("Te pasaste Amigo");
		    } else if (número < valor){
		        System.out.print("Casi cerca ...");
		    }
		    cont++;
		} while (número != valor);
		System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
	}

	/**
	 * Método que imprime por pantalla un mensaje para pedir un número.
	 * @param sc número introducido por el usuario
	 * @return Devuelve el valor int tecleado por el usuario
	 */
	public static int pideNúmero(Scanner sc) {
		int número;
		System.out.print("\nIntroduce el valor de X: ");
		número = sc.nextInt();
		return número;
	}
	}
