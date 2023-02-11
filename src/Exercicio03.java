import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double raio;
		double area = 3.14159;
		
		Scanner entrada = new Scanner(System.in);
		
		raio = entrada.nextDouble();
		area = 3.14159 * (raio * raio);
		System.out.println(String.format("A=%.4f", area));
	}

}
