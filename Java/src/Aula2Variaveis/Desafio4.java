
package Aula2Variaveis;
import java.util.Scanner;

public class Desafio4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double CapitalInicial;
		System.out.print("Digite o valor para investir R$: ");
		CapitalInicial = sc.nextDouble();
		
		double Juros;
		System.out.print("Qual é a taxa de juros? : ");
		Juros = sc.nextDouble();
		
		int TempoM;
		System.out.print("Qual o tempo em meses? : ");
		TempoM = sc.nextInt();
		
		double JurosSimples = CapitalInicial * Juros * TempoM;
		
		System.out.println("O montante total do Juros Simples foi de R$ " + JurosSimples);
		
		sc.close();												
	}

}
