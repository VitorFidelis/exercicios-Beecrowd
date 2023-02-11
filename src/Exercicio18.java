import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);

        int aux;
        int M = entrada.nextInt();
        int N = entrada.nextInt();

        while(M > 0 && N > 0) {

            int soma = 0;

            if (M > N) {
                aux = M;
                M = N;
                N = aux;
            }

            for (int i = M; i <= N; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);
            
            M = entrada.nextInt();
            N = entrada.nextInt();
          }
     }
}
