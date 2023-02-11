import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner entrada = new Scanner(System.in);
		
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		
		if( n1 > n2 && n1 > n3) {
			System.out.println( n1 + " eh o maior");
				
		}else if(n2 > n3) {
			System.out.println(n2 + " eh o maior");
			
		}else {
			System.out.println(n3 + " eh o maior");
		}
	}

}
