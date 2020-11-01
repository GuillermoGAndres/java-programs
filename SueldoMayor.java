import java.util.Scanner;

public class SueldoMayor {

    
    public static void main(String[] args) {
	    Scanner parse = new Scanner(System.in);
	    System.out.print("Escriba un entero: ");
	    int N = parse.nextInt();
	    int[] sueldos = new int[N]; // Aqui creamos un arreglo con N espacio de memoria para guardar los sueldos.
	    int sueldo = 0;
	    int sumSueldos = 0;
	    // Leemos cada sueldo y lo guardamos en el arreglo.
	    for(int i=0; i < N; i++) {
		System.out.printf("Escriba el sueldo %d: ", i+1); // Porque inicia cero le sumo uno, para que el primer sueldo sea sueldo 1.
		sueldo = parse.nextInt();
		sueldos[i] = sueldo;
		sumSueldos += sueldo;
	    }

	    //Iteramos entre los suelos y verificamos que cual es sueldo mas grande
	    int sueldoMax = sueldos[0]; // Supones que el primer sueldo es mas grande y con forme iteremos el arreglo se demostrar lo contrario y cambiara de valor o no.
	    for(int i=1; i < N; i++) {
		if(sueldos[i] >= sueldoMax)
		    sueldoMax = sueldos[i]; // Guardamos el valor del sueldo que encontro mayor.
	    }

	    int sueldoMin = sueldos[0]; // Igual que el anterior supones que es el minimo hasta el momento.
	    for(int i=1; i < N; i++){
		if(sueldos[i] <= sueldoMin)
		    sueldoMin = sueldos[i];
	    }

	    System.out.println("Sueldo promedio: " + ((float)sumSueldos/N)); //Hacemos un casteo a flotante, es decir, cambiamos el tipo de dato int a un float para ver los decimales.
	    System.out.println("Mayor sueldo ingresado: " + sueldoMax );
	    System.out.println("Menor sueldo ingresado: " + sueldoMin);
		
	    
    }
    
}
