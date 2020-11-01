import java.util.Scanner;

public class TablasExponentes {

    public static void main(String[] args) {
	Scanner parse = new Scanner(System.in);
	System.out.print("Valor de la base (N): ");
	int N = parse.nextInt();
	System.out.print("Valor del exponente (M): ");
	int M = parse.nextInt();

	for(int i=N; i <= M; i++) {
	    System.out.printf("| %d ^ %d =  %d |\n", N, i, exp(N,i));
	}
    }

    /**
     * Metodo auxiliar que te ayudara a sacar el valor de un exponenete
     * Al llamar a un metodo, este ejecuta las lineas de codigo del metodo.
     */
    public static int exp(int x,int n) {
	int acum = 1;
	for(int i=0; i < n; i++) {
	    acum = acum * x;
	}
	return acum;
    }
}
