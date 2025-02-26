
package Aula3GuiFer;
import java.util.Scanner;

public class Aula3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Celsius;
		double Fah;
		double Kel;
		
		System.out.print("Graus em Celsius para a conversão em Fahrenheit e Kelvin  : ");
		Celsius = sc.nextDouble();
		
		Fah = (Celsius * 9/5) + 32;
		Kel = (Celsius + 273.15);
		
		System.out.print("Fahrenheits : " + Fah + "   Kelvin : " + Kel);
		
		sc.close();												
	}

}
