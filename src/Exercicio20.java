import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int N;
		double X,Y;
		
		N = entrada.nextInt();
		
		for(int i = 0; i < N; i++) {
			X = entrada.nextDouble();
			Y= entrada.nextDouble();
			
			if(Y == 0) {
				System.out.println("divisao impossivel");
				
			}else {
				System.out.println(String.format("%.1f", (double)(X/Y)));
			}
		}
		
	}

}
