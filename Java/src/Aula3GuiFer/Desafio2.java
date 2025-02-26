
package Aula3GuiFer;
import java.util.Scanner;

public class Desafio2 {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int VelMax = 90;
	
		System.out.println("Quantos Km passou a ser acima da máxima?");
		int VelAtual = sc.nextInt();
		
		if (VelAtual + 90 > VelMax) {
			int calc = VelAtual  * 10;
			System.out.print("Você tera que pagar R$" + calc + ",00");
		}
		
		else {
			System.out.println("Isento a multas");
		}
		
		sc.close();
	}

}
