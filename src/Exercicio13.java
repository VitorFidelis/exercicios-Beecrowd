import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		double v1,v2,v3,r1,r2;
		
		Scanner entrada = new Scanner(System.in);
		
		v1 = entrada.nextDouble();
		v2 = entrada.nextDouble();
		v3 = entrada.nextDouble();
		
		if((v1 == 0) || ( v2 * v2 - 4 * v1 * v3 < 0)) {
			System.out.println("Impossivel calcular");
			
		}else {
			r2 = (double) ((v2 + Math.sqrt(v2 * v2 - 4 * v1 * v3))/(2 * v1));
			r1 = (double) ((v2 - Math.sqrt(v2 * v2 - 4 * v1 * v3))/(2 * v1));
			
			System.out.println(String.format("R1 = -%.5f", r1));
			System.out.println(String.format("R2 = -%.5f", r2));
		}
	}

}
