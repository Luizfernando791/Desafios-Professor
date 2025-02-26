
package Aula3GuiFer;
import java.util.Scanner;

public class Desafio1 {
	
	public static void main(String[] args) {		
		Scanner nota = new Scanner(System.in);
	
		System.out.println("Qual a primeira nota do aluno");
		Float n1 = nota.nextFloat();
		
		System.out.println("Qual a segunda nota do aluno");
		Float n2 = nota.nextFloat();
		
		Float calc = (n1 + n2) /2;

		if (calc >7 && calc <= 10) {
			System.out.println("Aptovado pae");
		} else if (calc <= 6.9 && calc >= 5.1) {
			System.out.println("Reprovado");
			
		} else if (calc <= 5 && calc >= 0) {
			System.out.println("Recuperation");
			
			System.out.println("Qual a sua nova nota 1 do aluno");
			Float n3 = nota.nextFloat();
			
			System.out.println("Qual a sua nova nota 2 do aluno");
			Float n4 = nota.nextFloat();
			
			Float calc2 = (n3 + n4) /2;	
			
			if (calc2 >= 7 && calc2 <= 10) {
				System.out.println("Aprovado");
			}
				else if (calc2 < 7 && calc2 >=0) {
					System.out.println("Refaça a matricula");
			}
			
				else {
					System.out.println(""
							+ "┈┈┈┈╱▏┈┈┈┈┈╱▔▔▔▔╲┈┈┈┈┈\r\n"
							+ "┈┈┈┈▏▏┈┈┈┈┈▏╲▕▋▕▋▏┈┈┈┈\r\n"
							+ "┈┈┈┈╲╲┈┈┈┈┈▏┈▏┈▔▔▔▆┈┈┈\r\n"
							+ "┈┈┈┈┈╲▔▔▔▔▔╲╱┈╰┳┳┳╯┈┈┈\r\n"
							+ "┈┈╱╲╱╲▏┈┈┈┈┈┈▕▔╰━╯┈┈┈┈\r\n"
							+ "┈┈▔╲╲╱╱▔╱▔▔╲╲╲╲┈┈┈┈┈┈┈\r\n"
							+ "┈┈┈┈╲╱╲╱┈┈┈┈╲╲▂╲▂┈┈┈┈┈\r\n"
							+ "┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈╲╱ ╲╱┈┈┈┈┈");
				}
			
			
		} else {
			System.out.println("Ta fazendo graça né fdp");
		}
		
		
	}

}
