import java.util.Scanner;
// Considerando el calendario: https://okdiario.com/curiosidades/cual-origen-del-nombre-meses-3395364

public class FechaCorrecta {

    
    public static void main(String[] args) {
	int day, month, year;
	// Le pongo parse porque viene de una palabra en ingles que se refiere analizar gramaticalmente, que es lo hace realmente
	// analiza las entradas gramaticalmente(integer, string, float, ..., char);
	Scanner parse = new Scanner(System.in);
	System.out.print("Day: ");
	day  = parse.nextInt();
	System.out.print("Month: ");
	month  = parse.nextInt();
	System.out.print("Year: ");
	year = parse.nextInt();

	 //Para hacerlo más leible y mas entendible  escribire las variables dias,
	// puedes ahorrate memoria y hacerlas sin ella solo ocupando los numeros que le corresponden.
	final int JANUARY=1, FEBRUARY=2, MARCH=3, APRIL=4, MAY=5, JUNE=6, JULY=7, AUGUST=8, SEPTEMBER=9, OCTOBER=10, NOVEMBER=11, DECEMBER=12;

	// Aqui puedes pensar como una demostracion, supones que la fecha es false, y demuestras que es verdadera gracias a las premisas de las condicionales(if and else).
	boolean fechaCorrecta = false;

	//Siginica que es uno de estos meses y por lo tanto tendran que tener menores que 31 dias.
	//Verificamos el dia como tambien el año que deben ser positivo
	if( (month == JANUARY || month == MARCH || month == MAY || month == JULY || month == AUGUST || month ==  OCTOBER || month == DECEMBER) && day <= 31  && year >= 1) 
	    fechaCorrecta = true;
	else if ( (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) && day <= 30 && year >= 1) 
	    fechaCorrecta = true;
	else if ( (month == FEBRUARY) && day <=28 && year >= 1)
	    fechaCorrecta = true;
	 // Cuando es sola una instruccion no es necesario llevar llavers {}
	
	if(fechaCorrecta)
	    System.out.println("Fecha correcta");
	else
	    System.out.println("Fecha INCORRECTA");
	
    }
}
