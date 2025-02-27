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
                double resultado1 = emprestimo + 0.05;
                System.out.printf("O valor do emprestimo R$ " + emprestimo + " para dólares é US$ "+ resultado1);
                break;
            case 12:
                double resultado2 = reais * euro;
                System.out.printf("A conversão de R$" + reais + " para euros é €" + resultado2);
                break;
            case 24:
                double resultado3 = reais * libra;
                System.out.printf("A conversão de R$" + reais + "para libras é £" + resultado3);
                break;
            default:
                System.err.println("Opção inválida! Escolha uma opção entre 1 e 3.");
                break;
        }

        MeuObjeto.close();
    }
}

