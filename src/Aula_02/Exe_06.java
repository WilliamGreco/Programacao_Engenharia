package Aula_02;

import java.util.Scanner;

public class Exe_06 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro numero...");
        int num1 = ler.nextInt();

        System.out.println("Informe o segundo numero...");
        int num2 = ler.nextInt();

        System.out.println("Informe o terceiro numero...");
        int num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro numero  " + num1 + " é o maior.");

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo numero " + num2 + " é o maior.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O terceiro numero " + num3 + " é o maior.");
        }

    }

}
