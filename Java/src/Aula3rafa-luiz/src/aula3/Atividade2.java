package aula3;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
		
		System.out.println("digite o comprimento do primeiro lado do triangulo (A): " );
	    double A =  myObj.nextDouble() ;  

	    System.out.println("digite o comprimento do segundo lado do triangulo (B): " );
	    double B =  myObj.nextDouble() ;  

	    System.out.println("digite o comprimento do terceiro lado do triangulo (C): ");
	    double C =  myObj.nextDouble() ; 
	     
	    
	    if (A == B && C == B && A == C) {
			System.out.println("Os valores Equilátero");
		}
	    else if(A == B || C == B || A == C) {
	    	System.out.println("Os valores vão formar Isósceles");
		}else{
			System.out.println("Os valores vão formar Escaleno");
		}

	}

}
