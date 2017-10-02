package Aula_03;

import java.util.Scanner;

public class Exe_13 {

    public static void main(String[] args) {

        System.out.println("13. A série de Fibonacci é formada pela seqüência \n"
                + "1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de \n"
                + "gerar a série até o n−ésimo termo(definido pelo usuário).");

        Scanner ler = new Scanner(System.in);
        int num, i = 0, n1 = 1, n2 = 0;

        System.out.print("\nDigite um nº: ");
        num = ler.nextInt();

        while (i < num) {
            System.out.print(n1 + " ");

            n1 = n1 + n2;
            n2 = n1 - n2;

            i++;
        }
    }

}
