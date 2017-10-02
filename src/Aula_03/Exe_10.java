package Aula_03;

import java.util.Scanner;

public class Exe_10 {

    public static void main(String[] args) {

        System.out.println("/* 10. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer\n"
                + "número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja\n"
                + "ver a tabuada. A saída deve ser conforme o exemplo abaixo:\n"
                + "Tabuada de 5:\n"
                + "5 X 1 = 5\n"
                + "5 X 2 = 10\n"
                + "...\n"
                + "5 X 10 = 50");

        Scanner ler = new Scanner(System.in);

        System.out.print("\nDigite o nº para ver a tabuada: ");
        int num = ler.nextInt();

        int contNum = 0;

        while (contNum <= 10) {
            System.out.println(num + " x " + contNum + " = " + (num * contNum));
            contNum++;
        }
    }

}
