package Aula_03;

import java.util.Scanner;

public class Exe_16 {

    public static void main(String[] args) {

        System.out.println("16. Faça um programa que, dado um conjunto de N números (N definidos pelo\n"
                + "usuário), determine: o menor valor, o maior valor e a soma dos valores.");

        Scanner ler = new Scanner(System.in);

        char sair = 'N';
        int num = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE,
                soma = 0;

        while (sair == 'N' || sair == 'n') {
            System.out.print("\nDigite um nº: ");
            num = Integer.parseInt(ler.next());

            System.out.print("\nsair? (S|N): ");
            sair = ler.next().charAt(0);

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

            soma += num;
        }

        System.out.println("Maior nº: " + maior);
        System.out.println("Menor nº: " + menor);
        System.out.println("Soma: " + soma);
    }

}
