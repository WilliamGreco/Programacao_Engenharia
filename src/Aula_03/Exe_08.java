package Aula_03;

import java.util.Scanner;

public class Exe_08 {

    public static void main(String[] args) {

        System.out.println("8. Faça um programa que receba dois números inteiros e gere os números\n"
                + "inteiros que estão no intervalo compreendido por eles.");

        Scanner ler = new Scanner(System.in);

        System.out.print("\nDigite o 1º número: ");
        int n1 = ler.nextInt();

        System.out.print("\nDigite o 2º número: ");
        int n2 = ler.nextInt();

        System.out.println("\nIntervalo: ");

        while (n1 <= n2) {
            System.out.print(n1 + " ");
            n1++;
        }
    }

}
