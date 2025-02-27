package Aula3desafio1;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner MeuObjeto = new Scanner(System.in);

        System.out.println("| Conversor de Moedas |");
        System.out.println("| 1- Dólar (R$ 1 = US$ 0.20) |");
        System.out.println("| 2- Euro (R$ 1 = € 0.18) |");
        System.out.println("| 3- Libra (R$ 1 = £ 0.15) |");

        double dolar = 0.20;
        double euro = 0.18;
        double libra = 0.15;

        System.out.print("Digite a quantidade de dinheiro para converter (R$): ");
        double reais = MeuObjeto.nextDouble();

        System.out.print("Digite a opção desejada para conversão: ");
        int opcao = MeuObjeto.nextInt();

        switch (opcao) {
            case 1:
                double resultado1 = reais * dolar;
                System.out.printf("A conversão de R$ " + reais + \" para dólares é US$ "+ resultado1);
                break;
            case 2:
                double resultado2 = reais * euro;
                System.out.printf("A conversão de R$" + reais + " para euros é €" + resultado2);
                break;
            case 3:
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
