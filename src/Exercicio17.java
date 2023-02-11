import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros,pares;
		
		pares = 0;
		
		for(int i = 0; i < 5; i++) {
			numeros = entrada.nextInt();
			
			if (numeros % 2== 0) {
				pares+=1;
			}
		}
		System.out.println(pares + " valores pares");
	}
}
