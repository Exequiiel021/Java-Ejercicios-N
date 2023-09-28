package ejercicio3;

//2. Genere una clase que tenga los métodos para realizar la codificación y decodificación
//de un string, dado un número de desplazamiento.
//● Por ejemplo, con desplazo de 1:
//“hola que tal” -> “ipmbarvfaubm”
//h -> i
//o -> p
//● con desplazo de 2
//“hola que tal” -> “jqncbswgbvcn”
//h -> j
//o -> q
//En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
//Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por
//ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde
//arr es un char[]. Tenga a mano los javadocs del mismo

//EXE

import java.util.Scanner;

public class ejercicio2_A {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese una Frase");
		String frase = leer.nextLine();
		
		int desplazamiento = 1;

		char fraseCharArray[] = frase.toCharArray();
		
		for (int i = 0; i < fraseCharArray.length; i++) {
		    if (fraseCharArray[i] == 32) { // codigo ascii del espacio en blanco
		        fraseCharArray[i] = 'a';
		    } else {
		        fraseCharArray[i] += desplazamiento;
		    }
		}

		String fraseFinal = new String(fraseCharArray);
		System.out.println(fraseFinal);
	}
}