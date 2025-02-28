package aula3;
import java.util.Scanner;
public class Atividade {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 

		System.out.println("|Verificação de um triangulo|");
	    
		System.out.println("digite o comprimento do primeiro lado do triangulo (A): " );
	    double A =  myObj.nextDouble() ;  

	    System.out.println("digite o comprimento do segundo lado do triangulo (B): " );
	    double B =  myObj.nextDouble() ;  

	    System.out.println("digite o comprimento do terceiro lado do triangulo (C): ");
	    double C =  myObj.nextDouble() ; 
	     
	    
	    if (A+B > C && A + C > B && B + C > A) {
			System.out.println("os valores " + A + " E " + B +" E " + C +" são validos para formar um triangulo");
		}
	    else {
	    	System.out.println("nao forma um triangulo truta");
		}
	}

}
