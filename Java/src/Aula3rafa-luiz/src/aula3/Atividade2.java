package aula3;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
		
		System.out.println("Digite quantos KM voce percorreu: " );
	    double Km =  myObj.nextDouble() ;
	    double multa = 90 ;
	    if (Km > 90) {
	    	multa = (Km - multa )* 10 ; 
	    	System.out.println("Voce ultrapassou o limite de velocidade!" + multa);

		}
	    else {
	    	System.out.println("tudo certo");
		}
	}

}
