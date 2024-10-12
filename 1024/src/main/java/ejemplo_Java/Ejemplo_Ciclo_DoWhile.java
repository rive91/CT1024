package ejemplo_Java;

public class Ejemplo_Ciclo_DoWhile {

	public static void main(String[] args) {
		int b = 10;
		
		do {
			//El codigo dentro del "do" se ejecuta incluso si la condiciones es falsa
			System.out.println("el valor de B es:" + b);
			b++;
		}while (b<=20);

	}

}
