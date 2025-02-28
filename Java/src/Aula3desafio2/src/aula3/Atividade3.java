package aula3;
import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
	    
		System.out.println("|Calculadora de seguro de automoveis|");

		System.out.println("Meu fi digite sua idade: " );
	    int idade =  myObj.nextInt() ;  

	    System.out.println("Qual seu sexo (m) ou (f): " );
	    String sexo =  myObj.nextLine() ;  

	    System.out.println("Quanto anos de experiencia voce dirige: ");
	    int direcao =  myObj.nextInt() ; 
	    
	    if (idade <= 25 && sexo == "m" && direcao == 2) {
			System.out.println("Voce recebeu um seguro de R$2000");
		}else if(idade <= 25 && sexo == "f" && direcao == 2){
			System.out.println("Voce recebeu um seguro de R$1800");
		}else if(idade >=25 || direcao == 2){
			System.out.println("Voce recebeu um seguro de R$1200");
		}
	    else {
	    	System.out.println("Num tem essa opção aqui");
		}
	}

}
