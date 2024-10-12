package ejemplo_Java;

public class Ejemplo_Ciclo_For {

	public static void main(String[] args) {
		int y = 5;
		
		// bucle for comienza cuando x=0, x es una variable local dentro del FOR
		// "y" corre hasta <= 5
		for (int x = 0; x <= y; x++) {
			System.out.println("Valor de x: " + x);
		}

	}

}
