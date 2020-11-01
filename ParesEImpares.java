import java.util.Scanner;

public class ParesEImpares {

    public static void main(String[] args) {
	Scanner parse = new Scanner(System.in);
	System.out.print("Ingrese su numero: ");
	String numString = parse.next(); // Lee una cadena de la entrada estandar.
	int cantPares = 0; 
	int cantImpares = 0; 
	int sumPares = 0, sumImpares = 0;
	int  numInteger;
	while(!numString.equals("n") ) {
	    numInteger = Integer.parseInt(numString); // Este es un clase de biblioteca estandar que nos ayuda covertir una cadena a un numero.
	    if( numInteger % 2 == 0){
		cantPares++;
		sumPares += numInteger;
	    } else {
		cantImpares++;
		sumImpares += numInteger;
	    }
	    System.out.print("Ingrese su numero: ");
	    numString = parse.next(); // Lee una cadena de la entrada estandar.
	}
	System.out.println("------------------------------");
	System.out.println("Numero total de pares : " + cantPares);	
	System.out.println("Suma total de los valores de  numeros pares: " + sumPares);
	System.out.println("Promedio de los valores pares: " + ((float)sumPares/cantPares)); //Hacemos un casteo a flotante, es decir, cambiamos el tipo de dato int a un float para ver los decimales.
	System.out.println("------------------------------");
       	System.out.println("Numero total de impares : " + cantImpares);	
	System.out.println("Suma total de los valores de numeros impares: " + sumImpares);
	System.out.println("Promedio de los valores impares: " + ((float)sumImpares/cantImpares));
    }
}

// Asi puede verificar que tipo de dato es:
//Object obj = numInteger;
//System.out.println(obj.getClass()); 

//Operador ternario, una maenera de contar pares e impares sin usar un if y else.
// cantPares += (numInteger % 2 == 0) ? 1 : 0; // Este es una manera simplificada de usar if else cuando solo es un 1 if y un 1 else.
// cantImpares += (numInteger % 2 == 1) ? 1 0; // Se llama operador ternario.

