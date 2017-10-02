package Aula_03;

import java.util.Scanner;

public class Exe_19 {

    public static void main(String[] args) {

        System.out.println("19. Os números primos possuem várias aplicações dentro da Computação, por\n"
                + "exemplo na Criptografia. Um número primo é aquele que é divisível apenas\n"
                + "por um e por ele mesmo. Faça um programa que peça um número inteiro e \n"
                + "determine se ele é ou não um número primo.");

        Scanner ler = new Scanner(System.in);
        int cont = 0, num, i = 1;

        System.out.print("\nDigite um nº: ");
        num = ler.nextInt();

        while (i <= num) {
            if (num % i == 0) {
                cont += 1;
            }

            i++;
        }

        if (cont == 2) {
            System.out.println("\nO nº é primo!");
        } else {
            System.out.println("\nO nº não é primo!");
        }

    }

}
