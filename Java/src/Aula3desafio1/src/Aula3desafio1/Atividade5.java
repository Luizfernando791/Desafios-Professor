package Aula3desafio1;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner MeuObjeto = new Scanner(System.in);

        System.out.println("| Calculo de Taxa de empréstimo |");

        System.out.println("|Numero de parcelas (6 , 12 , 24) meses");

        System.out.print("Digite um valor para fazer um empréstimo(R$): ");
        double emprestimo = MeuObjeto.nextDouble();

        System.out.print("Digite a opção desejada para fazer um numero de parcelas: ");
        int opcao = MeuObjeto.nextInt();

        switch (opcao) {
            case 6:
                double taxa1 = 0.05;           
                double resultado1 = emprestimo * (1 + taxa1);
                System.out.printf("O valor do emprestimo R$ " + emprestimo + " Sendo seu valor total de R$ "+ resultado1);
                break;
            case 12:
            double taxa2 = 0.10;           
            double resultado2 = emprestimo * (1 + taxa2);
            System.out.printf("O valor do emprestimo R$ " + emprestimo + " Sendo seu valor total de R$ "+ resultado2);
                break;
            case 24:
            double taxa3 = 0.20;           
            double resultado3 = emprestimo * (1 + taxa3);
            System.out.printf("O valor do emprestimo R$ " + emprestimo + " Sendo seu valor total de R$ "+ resultado3);
                break;
            default:
                System.err.println("Opção inválida! Escolha uma opção entre 1 e 3.");
                break;
        }

        MeuObjeto.close();
    }
}

