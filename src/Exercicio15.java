
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		float novo_salario,salario,reajuste,percentual;
		
		Scanner entrada = new Scanner(System.in);
		
		salario = entrada.nextFloat();
		
		if(salario >= 0 && salario <= 400) {
			reajuste = (salario * 0.15f);
			novo_salario = (salario + reajuste);
			percentual = 15;
			
		}else if(salario >= 400.01 && salario <= 800) {
			reajuste = (salario * 0.12f);
			novo_salario = (salario + reajuste);
			percentual = 12;
			
		}else if(salario >= 800.01 && salario <= 1200) {
			reajuste = (salario * 0.10f);
			novo_salario = (salario + reajuste);
			percentual = 10;
			
		}else if(salario >= 1200.01 && salario <= 2000) {
			reajuste = (salario * 0.07f);
			novo_salario = (salario + reajuste);
			percentual = 7;
			
		}else {
			reajuste = (salario * 0.04f);
			novo_salario = (salario + reajuste);
			percentual = 4;
		}
		System.out.println(String.format("Novo salario: %.2f", novo_salario));
		System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
		System.out.println(String.format("Em percentual: %.0f", percentual) +" %");
	}
}
