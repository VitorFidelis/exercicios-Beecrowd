import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int A,B,C,D,diferenca;
		
		Scanner entrada = new Scanner(System.in);
		
		
		A = entrada.nextInt();
		
		B = entrada.nextInt();
		
		C = entrada.nextInt();
		
		D = entrada.nextInt();
		
		diferenca= (A * B - C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
	}

}
