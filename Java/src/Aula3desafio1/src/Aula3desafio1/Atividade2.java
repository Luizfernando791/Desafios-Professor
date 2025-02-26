package Aula3desafio1;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner MeuObjeto = new Scanner(System.in);
        int LimiteKM = 90;
        double Multa = 10.0;

        System.out.println("| Calculadora de Multa por Excesso de Velocidade |");

        System.out.println("Digite a velocidade do seu veículo em (KM):");
        double KM = MeuObjeto.nextDouble();

        if (KM > LimiteKM) {  
            double KMfinal = KM - LimiteKM;
            double MultaFinal = KMfinal * Multa;
            System.out.println("Você ultrapassou o limite de velocidade! Sua multa foi de R$ " + MultaFinal);
        } else {
            System.out.println("A sua velocidade está dentro do limite, sem multas.");
        }

        MeuObjeto.close();
    }
}
