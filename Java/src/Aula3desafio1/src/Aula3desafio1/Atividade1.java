package Aula3desafio1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
			Scanner myObj = new Scanner(System.in); 

			System.out.println("|Sistema de Notas Detalhado|");
			
			System.out.println("digite a primeira nota " );
		    double n1 =  myObj.nextDouble() ;  
	
		    System.out.println("digite a segunda nota: " );
		    double n2 =  myObj.nextDouble() ;  
	
		    System.out.println("digite a terceira nota ");
		    double n3 =  myObj.nextDouble() ; 	
		    
		    double resultado = (n1 + n2 + n3) / 3;
		    if (resultado < 5) {
		    	System.out.println("reprovado ");
			}
		    else if (resultado >= 5 ) {
				if (resultado <=6.9) {
					System.out.println("recuperação ");
				}
			}else if (resultado >= 7 ) {
				if (resultado <= 8.9) {
					System.out.println("aprovado");
				}
			}
			else {
				System.out.println("aprovado com distição - excelente!");
			}

	}

}
