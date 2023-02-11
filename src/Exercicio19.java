import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		double salario_fixo,total_vendas,total_mes;
		
		nome = entrada.next();
		salario_fixo = entrada.nextDouble();
		total_vendas = entrada.nextDouble();
		
		total_mes = salario_fixo + ((total_vendas * 15)/100);
		
		System.out.println(String.format("TOTAL = R$ %.2f" , total_mes));
		
	}

}
