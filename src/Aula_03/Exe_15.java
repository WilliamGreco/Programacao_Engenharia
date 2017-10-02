package Aula_03;

import java.util.Scanner;

public class Exe_15 {

    public static void main(String[] args) {

        System.out.println("15. Faça um programa que calcule o fatorial de um número inteiro fornecido\n"
                + "pelo usuário. Ex.: 5!=5.4.3.2.1=120.");

        Scanner ler = new Scanner(System.in);

        System.out.print("\nDigite um nº: ");
        int fat = ler.nextInt();

        int i = fat - 1;

        while (i > 0) {
            fat *= i;
            i--;
        }

        System.out.println("\nResultado = " + fat);
    }

}
