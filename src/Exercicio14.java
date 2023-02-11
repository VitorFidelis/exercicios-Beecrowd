import java.util.Scanner; 

public class Exercicio14 {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,media,exame;
		
		Scanner entrada = new Scanner(System.in);
		
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		n3 = entrada.nextFloat();
		n4 = entrada.nextFloat();
		
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1))/10;
		
		System.out.println(String.format("Media: %.1f", media));
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
			
		}else if(media < 6.9 && media >= 5.0) {
			System.out.println("Aluno em exame.");
			exame = entrada.nextFloat();
			System.out.println(String.format("Nota do exame: %.1f", exame));
			
			media = ((media + exame))/2;
			
			if(media >= 5.0) {
				System.out.println("Aluno aprovado.");
				
			}else{
				System.out.println("Aluno reprovado.");
				
			}
			
			System.out.println(String.format("Media final: %.1f", media));
			
		}else {
			System.out.println("Aluno reprovado.");
		}

	}

}
