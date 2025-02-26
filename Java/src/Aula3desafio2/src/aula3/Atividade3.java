package aula3;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
	    
		System.out.println("digite sua idade: " );
	    int A =  myObj.nextInt() ;  

	    System.out.println("sexo (m) ou (f): " );
	    String B =  myObj.nextLine() ;  

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
