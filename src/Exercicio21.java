import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		int numero1,numero2,soma;
		
		Scanner entrada = new Scanner(System.in);
		
		numero1= entrada.nextInt();
		numero2 = entrada.nextInt();
		
		soma = (numero1 * numero2);
		
		System.out.println("PROD = " + soma);
	}

}
