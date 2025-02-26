package Aula3desafio1;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner MeuObjeto = new Scanner(System.in);
        

        System.out.println("| Conversor de Moedas |");
        System.out.println("| 1- Dólar (R$ 1 = US$ 0.20) |");
        System.out.println("| 2- Euro (R$ 1 = 0.18) |");
        System.out.println("| 3- Libra (R$ 1 = 0.15) |");

        double dolar = 0.20;
        double euro = 0.18;
        double libra = 0.15;

        System.out.println("Digite a quantidade de de dinhero para converter R$:");
        double Reais = MeuObjeto.nextDouble();

        System.out.println("Digite a opção que voce queira fazer a conversão:");
        double opcao = MeuObjeto.nextDouble();

        switch (opcao) {

        case 1:
            double resultado1 = Reais * dolar;
            System.out.println("A conversão de reais para dolares é de US$: " + resultado1);
            break;
        case 2:
            double resultado2 = Reais * euro;
            System.out.println("A conversão de reais para dolares é de US$: " + resultado2);
            break;
        
        default:
            System.err.println("Vc não digitou uma opção correta!");
            break;
        }
        
        

        MeuObjeto.close();
    }
}


