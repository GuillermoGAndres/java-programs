import java.util.Scanner; //Importa la clase Scanner que nos ayudara a leer numeros.

public class Factorial {

    /**
     * Metodo principal, precisamente este metodo es cargado en memoria(RAM) cuando se ejecuta el programa y al estar en memoria es ejecutado por el procesador(CPU).
     * Static -  lo que hace es carga ese metodo a la memoria, esa es la razón por la cual siempre en este metodo lleva static, si no estuviera
     * este metodo jamas se cargaria en la memoria, y la CPU nunca podria ejecutarlo. (Todo programa necesita ser cargado en la memoria para ser ejecutado).
     * Public - La palabra public es una palabra reservada que nos indica que será visibles fuera de clase, precisamente por eso clase y metodo es public, esto
     * nos indica que este metodo sera visible por otra clase, es decir, si la otra clase desea utilizar este metodo podria importarla y llamar el metodo.
     * Existen tambien otros modificadores de visibilidad como public, private y protected, todos se refieren al termino encapsulamiento que una de las cosas fundamentales
     * de la programacion orienteada objeto, posiblemente lo veras más adelante.
     * Metodo - Se referire a la pieze de codigo que puede ejecutarse varias si es llamado, en java solo existirá un metodo llamado main y con un arg y que no devuelve
     * ningun datos.
     * void - Se refiere que no devuelme un dato cuando es llamado.
     * args - Es el parametro de main que siempre va seguido de el, este es un arreglo que contiene los argumentos de programa. Un arreglo es una estructura de datos,es decir
     * se encarga de estructurar los datos cuando son muchos, entonces reserva mucho espacio de memoria para cada uno de estos datos.
     * Memoria
     * [4][6][8][34][66] ... [n]
     * Precismente cuado tu ejecutas el programa pueder llamarlo con sus argumento o sin ellos.
     * Compilacion
     * javac Greeting.java
     * Execute (Con argumentos)
     * java Greeting Sofia Mario Lugi ...
     * Representacion en la memoria
     * [Sofia] [Mario] [Luigi] ... [n]
     * Execute (sin argumentos)
     * java Greeting 
     * [] [] [] [] ... []
     * Normalmente estamos acostrubrados a ejecutar los programas sin argumentos, pero siempre sera posible ponerle los argumentos y ejecutarlos, un ejemplo de esto siempre seran los
     * comandos de tu terminal (CMD for windows, Terminal for linux).
     */
    public static void main(String[] args) {
	// Declaracion de variables que vamos ocupar.
	int num;
	// Aqui puedes pensar como una demostracion, supones que la flag es verdadera, y demuestras que es falso gracias a las premisas de las condicionales(if and else).
	boolean flag = true; // No ayudara como variable auxiliar para terminar un loop(ciclo).
	
	// Se crea un instancia de Scanner, precisamente cuando creamos instancias(objetos)  de una clase, se crea un espacio de memoria para esa instancia y por lo tanto
	// para el procesado sera posible ejecutarlo. Esto lo hacemos para poder utilizar los metodos de la clase Scanner que nos ayudan a leer numeros, como veras
	// nosotros podemos llamar esos metodos porque fueran implementados con la palabra public en su implementacion de Scanner, por eso puedo visualizar y ejecutarlos.
	Scanner parse = new Scanner(System.in); // Se pasa el argumento System.out que es la referencia de la entrada estandar(teclado), es decir que va leer los datos de ese entrada.

	// Hacemos un do-while para precisamente hacer la primera comparacion, si esta entre el rango solicitado y si no volver repetir la operacion hasta que cumpla que
	// esta en el rango.
	do {
	    System.out.print("Ingrese un valor de 0 a 25: "); // El metodo println imprime un valor a la salida estandar(terminal).
	    num = parse.nextInt(); // Indica que va leer solamente un valor de entero(int) de tu entrada.
	    // Comparamos si num esta en el rango de [0, 25]
	    if(num >= 0 && num <= 25) {
		flag = false; // Con esto saldria del loop y la condicion(preposision) seria falsa.
	    } else {
		System.out.println("Su numero ingresado debe de estar entre 0 y 25");// Imprime en la salida estandar con un salto de linea, por eso la n al final(new line).
	    }
	}while(flag);

	// Sacamos el factorial de ese numero, al ver la defincion de factorial exiten multples maneras de hacerlo recursivamente o iterativamente.
	// Recursivamente se refieres hacer un metodo que se llame a si mismo y que termine cuando cumpla cierta condicion.
	// Iterativamente se refiere a iterar, que es lo que hacemos al hacer un for, vamos iterando uno por uno haste llegar a cierta condición.
	int acum = 1; //Acumulara los resultados anteriores.
	for(int i=num; i >  0; i--) {
	    /* 
	       Representacion grafica cuando num=5 y acum=1
	       acum(acumular) toma ahora el valor de 5 y asi sucesivamente con los demas, va toamndoe el resultado;
		1(acum)   * 5 (i) = 5; 
		5(acum)   * 4 (i) = 20;
		20(acum)  * 3 (i) = 60
		60(acum)  * 2 (i) = 120
		120(acum) * 1 (i) = 120
	    */
	    acum = acum * i;  // Multiplica " actual * anterior "
	}
	System.out.println(acum);
       
    }
}
