package Aula_02;

import java.util.Scanner;

public class Exe_01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro valor...");
        float num1 = ler.nextFloat();

        System.out.println("Informe o segundo valor...");
        float num2 = ler.nextFloat();

        if (num1 > num2) {
            System.out.println("O valor " + num1 + ", é o maior.");

        } else if (num2 > num1) {
            System.out.println("O valor " + num2 + ", é o maior.");

        }

    }

}
