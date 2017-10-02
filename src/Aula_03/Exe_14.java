package Aula_03;

import java.util.Scanner;

public class Exe_14 {

    public static void main(String[] args) {

        System.out.println("14. A série de Fibonacci é formada pela seqüência \n"
                + "0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere\n"
                + "a série até que o valor seja maior que 500. \n"
                + "Maior??");

        Scanner ler = new Scanner(System.in);
        int i = 0, n1 = 1, n2 = 0;

        while (i <= 500) {
            System.out.print(n1 + " ");

            n1 = n1 + n2;
            n2 = n1 - n2;

            i++;
        }
    }

}
