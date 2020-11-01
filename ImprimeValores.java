import java.util.Scanner;

public class ImprimeValores {

    public static void main(String[] args) {
	Scanner parse = new Scanner(System.in);
	// Es buena practica inicializar los valores de la variables ya sea con un valor null,0,0.0 o "" para el caso de las cadenas, siendo valores neutros que no afecten al problema.
	int value = 0; 
	do {
	    System.out.print("Escriba un numero mayor o igual a 100: ");
	    value = parse.nextInt();    

	}while(!(value >= 100)); //! Significa negacion como las tablas de verdad con "~p". Lo que dice es "Si valor no es mayor igual a 100 entra al ciclo nuevamente".

	for(int i = 0; i < value; i += 6){ // i += 6 es equivalente a decir i = i + 6 que significa "Con tu valor actual aumentale 6 asi sucesivamente".
	    System.out.println(i);
	    
	}
		
    }
}
