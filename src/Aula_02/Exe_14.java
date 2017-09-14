package Aula_02;

import java.util.Scanner;

public class Exe_14 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char op;

        do {

            float media;

            System.out.println("********CALCULADORA***DE***MEDIAS********");

            System.out.println("Informe o valor da primeira nota...");
            float n1 = ler.nextFloat();

            System.out.println("Informe o valor da segunda nota...");
            float n2 = ler.nextFloat();

            media = (n1 + n2) / 2;

            if (media >= 9.0 && media <= 10.0) {
                System.out.println("Aprovado, sua media final foi A");
            } else if (media >= 7.5 && media < 9.0) {
                System.out.println("Aprovado, sua media final foi B");
            } else if (media >= 6.0 && media < 7.5) {
                System.out.println("Aprovado, sua media final foi C");
            }

            if (media >= 4.0 && media < 6.0) {
                System.out.println("Reprovado, sua media final foi D");
            } else if (media < 4.0){
                System.out.println("Reprovado, sua media final foi E");
            }

            System.out.println("*********************************************");

            System.out.println("Você dejesa repetir a consulta (S / N)? :");
            op = ler.next().charAt(0);

        } while (op == 's' || op == 'S');

    }

}
