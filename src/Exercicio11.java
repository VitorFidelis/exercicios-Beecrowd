import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		float A,B,C,Media;
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextFloat();
		B = entrada.nextFloat();
		C = entrada.nextFloat();
		
		Media = ((A * 2) + (B * 3) + (C * 5))/10;
		
		System.out.println(String.format("MEDIA = %.1f", Media));
	}

}
