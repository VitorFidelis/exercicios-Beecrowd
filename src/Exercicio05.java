import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double A, B, Media;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextDouble();
		
		B = entrada.nextDouble();
		
		Media = ((3.5 * A) + (7.5 * B))/11;
		
		System.out.println(String.format("MEDIA = %.5f" , Media));
	}
}
