/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) 
 *e o total de combustível gasto (em litros).
 **/

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		int distancia_total_percorrida;
		
		float combustivel_gasto,consumo_medio;
		
		Scanner entrada = new Scanner(System.in);
		
		distancia_total_percorrida = entrada.nextInt();
		
		combustivel_gasto = entrada.nextFloat();
		
		consumo_medio = (distancia_total_percorrida/combustivel_gasto);
		
		System.out.println(String.format("%.3f km/l",consumo_medio));
	}

}
