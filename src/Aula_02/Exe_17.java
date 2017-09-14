package Aula_02;

import java.util.Scanner;

public class Exe_17 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um ano...");
        int ano = ler.nextInt();

        if (ano % 400 == 0) {
            System.out.println("O Ano " + ano + " é bissexto...");
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println("O Ano " + ano + " é bissexto...");
        } else {
            System.out.println("O Ano " + ano + " não é Bissexto...");
        }

    }

}
