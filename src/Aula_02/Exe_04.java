package Aula_02;

import java.util.Scanner;

public class Exe_04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma letra de A á Z.");
        String az = ler.next();

        if (az.equalsIgnoreCase("a") || (az.equalsIgnoreCase("e") || (az.equalsIgnoreCase("i")
                || (az.equalsIgnoreCase("o") || (az.equalsIgnoreCase("u")))))) {

            System.out.println("A letra " + az + " é uma VOGAL.");

        } else {
            System.out.println("A letra " + az + " é uma CONSOANTE.");

        }

    }

}
