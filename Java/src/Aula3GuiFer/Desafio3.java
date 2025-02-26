
package Aula3GuiFer;
import java.util.Scanner;

public class Desafio3 {
	
	public static void main(String[] args) {		
		Scanner op = new Scanner(System.in);
		Scanner v = new Scanner(System.in);
		String tipo;
		double calc;
		
		System.out.println("Qual o Valor da compra?");
		double valor = v.nextDouble();
		
		System.out.println("1. Debito");
		System.out.println("2. Credito");
		System.out.println("3. Pix/Dinheiro");
		
		System.out.println("Qual a forma de pagamento?");
		int opcao = op.nextInt();
		
		switch (opcao) {
		case 1:
			tipo = "Debito";
			calc = valor * 0.9;
			System.out.println(" O medoto escolhindo foi " + tipo + " a compra ficara em R$ " + calc );
			break;
			
		case 2:
			tipo = "Credito";
			calc = valor;
			System.out.println(" O medoto escolhindo foi " + tipo + " a compra ficara em R$ " + calc );
			
			System.out.println("Parcela em quantas vezes bora bill");
			System.out.println("1. A visão 👁️");
			System.out.println("2. 2x com 5% de Juros");
			System.out.println("3. 4x com 10% de Juros");
			
			int opcao2 = op.nextInt();
			
			switch (opcao2) {
			case 1:
				System.out.println("Obrigado vai ficar então por : " + calc + " rico pa krl einkkkkkkkkkkkkkkkkkkkkkkkkkkk");
					
				break;
			case 2:
				System.out.println(" O método escolhindo foi 2x a compra ficara em R$ "+ calc / 2 + " com 5% de Juros ( " + (calc / 2) * 0.05 + " )");
				System.out.println("O total a prazo ficara em " + (calc + (calc / 2) * 0.10));
				
				break;
			case 3:
				System.out.println(" O método escolhindo foi 4x a compra ficara em R$ "+ calc / 4 + " com 10% de Juros ( " + (calc / 2) * 0.10 + " )");
				System.out.println("O total a prazo ficara em " + (calc + (calc / 2) * 0.20));
				break;
			default:
				break;
			}
			
			break;
			
		case 3:
			tipo = "Pix/Dinheiro";
			calc = valor * 0.95;
			System.out.println(" O medoto escolhindo foi " + tipo + " a compra ficara em R$ " + calc );
			break;

		default:
			System.out.println("INVÁLIDOOOO");
			break;
		}
		
		
	}

}
