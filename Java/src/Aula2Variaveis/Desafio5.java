
package Aula2Variaveis;
import java.util.Scanner;

public class Desafio5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Raio;
		System.out.print("Digite o Raio da Circunferência de um Círculo : ");
		Raio = sc.nextDouble();
		
		double Area = Math.PI * Math.pow(Raio, 2);
		double Peri = 2 * Math.PI * Raio;
		
		System.out.printf("A sua área é de " + Area + " e seu Perimetro é de " + Peri);
		
		sc.close();												
	}

}
