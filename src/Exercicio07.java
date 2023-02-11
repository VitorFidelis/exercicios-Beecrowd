import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int funcionario,horas;
		
		double horavalor,salariof;
		
		Scanner entrada = new Scanner(System.in);
		
		funcionario = entrada.nextInt();
		horas = entrada.nextInt();
		horavalor = entrada.nextDouble();
		
		salariof = horas * horavalor;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.println(String.format("SALARY = U$ %.2f", salariof));
	}

}
