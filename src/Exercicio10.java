import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int dias_idade, dias, anos, meses;
		
		Scanner entrada = new Scanner(System.in);
		
		dias_idade = entrada.nextInt();
		
		anos = dias_idade / 365;
		
		meses = (dias_idade % 365) / 30;
		
		dias = (dias_idade % 365) % 30;
		
		System.out.println(anos + " ano(s)");
		
		System.out.println(meses + " mes(es)");
		
		System.out.println( dias + " dia(s)");

	}
}
