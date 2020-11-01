import java.util.Scanner;

public class Ordenados {

    public static void main(String[] args) {
	Scanner parse = new Scanner(System.in);
	System.out.print("Escriba en una sola linea los tres numeros: ");
	int a = parse.nextInt();
	int b = parse.nextInt();
	int c = parse.nextInt();
	// The Trick Verifica cual es el numero mas grande, y ya ahi de ahi comparas los dos que faltan, recuerda tambien:
	// El Principio basico de conteo se  3 * 2 *1 = 6 combinaciones posibles de acomodar 3 numeros, dado esos tres numero solo habra 6 formas posibles de elegir la respuesta.
	System.out.println("Numero ordenados");
	if( a >= b && a >= c) //Aqui ya sabemos que a es la mas grande
	    if (b >= c ) 
		System.out.printf("%d %d %d\n", c, b, a);
	    else			    
		System.out.printf("%d %d %d\n", b, c, a);
	else if( b >= a && b >= c )	    
	    if(a >= c)			    
		System.out.printf("%d %d %d\n", c, a, b);
	    else			    
		System.out.printf("%d %d %d\n", a, c, b);
	else if ( c >= a && c >= b)	    
	    if(a >= b)			    
		System.out.printf("%d %d %d\n", b, a, c);
	    else			    
		System.out.printf("%d %d %d\n", a, b, c );
	
	
	    
	    
    }
}
