package corrida;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int numCompetidores = 0;
		int distancia = 0;
		int passadaMaxima = 0;
		
		System.out.println("Digite o numero de corredores: ");
		Scanner scanner = new Scanner(System. in); 
		numCompetidores = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite a distancia total da corrida: ");
		distancia = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o tamanho maximo da passada: ");
		passadaMaxima = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		
		for (int i = 0; i < numCompetidores; i++) {
			new Corredor(i, distancia,passadaMaxima);
		}
		
	}

}
