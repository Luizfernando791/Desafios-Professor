
package Aula2Variaveis;
import java.util.Scanner;

public class Desafio3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Nota1;
		System.out.print("Digite a sua primeira nota : ");
		Nota1 = sc.nextDouble();
		
		double Nota2;
		System.out.print("Digite a sua segunda nota : ");
		Nota2 = sc.nextDouble();
		
		double Nota3;
		System.out.print("Digite a sua terceira nota : ");
		Nota3 = sc.nextDouble();
		
		double Media = (Nota1 + Nota2 + Nota3) / 3;
		
		System.out.print("Em média você teria : " + Media);
		
		sc.close();												
	}

}
