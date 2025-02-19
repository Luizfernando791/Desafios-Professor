
package Aula2Variaveis;
import java.util.Scanner;

public class Desafio2 {
	
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
		
		double MontanteFinal = CapitalInicial * Math.pow((1 + Juros), TempoM);
		
		System.out.println("O montante total foi de R$:" + MontanteFinal);
		
		sc.close();												
	}

}
