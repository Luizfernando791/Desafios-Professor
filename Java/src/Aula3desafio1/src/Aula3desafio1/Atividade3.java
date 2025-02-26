package Aula3desafio1;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner MeuObjeto = new Scanner(System.in);
        

        System.out.println("| Adivinhe o número |");
        System.err.println("O jogo vai começar com a máquina escolehndo um numero aleátório e voce precia adivonhar qual é entre 1 á 10 ");

        int NumeroMaquina = (int)(Math.random()* 10); 

        System.out.println("Digite um numero entre 1 á 10:");
        Double NumeroJogador = MeuObjeto.nextDouble();

        if(NumeroMaquina == NumeroJogador){
            System.out.println("Voce acertou o numero meus parabens!");
            System.out.println("numero da máquina: "+ NumeroMaquina);
            System.out.println("numero da máquina: "+ NumeroJogador);

        }else{
            System.out.println("Voce errou o numero , que pena!");
            System.out.println("numero da máquina: "+ NumeroMaquina);
            System.out.println("numero da máquina: "+ NumeroJogador);
        }
        

        MeuObjeto.close();
    }
}

