import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int codigo01,peca01,codigo02,peca02;
		double valor01,valor02,valor;
		
		Scanner entrada = new Scanner(System.in);
		
		codigo01 = entrada.nextInt();
		peca01 = entrada.nextInt();
		valor01= entrada.nextDouble();
		
		codigo02 = entrada.nextInt();
		peca02 = entrada.nextInt();
		valor02 = entrada.nextDouble();
		
		valor = ((peca01 * valor01) + (peca02 * valor02));
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valor));
		
	}

}
