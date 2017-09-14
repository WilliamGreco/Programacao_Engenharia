package Aula_02;

import java.util.Scanner;

public class Exe_02 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor...");
        float num = ler.nextFloat();

        if (num < 0) {
            System.out.println("O valor " + num + ", é negativo.");

        } else if (num > 0) {
            System.out.println("O valor " + num + ", é positivo.");
        }

    }

}
