package Aula_03;

import java.util.Scanner;

public class Exe_30 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n;
        float h = 0;

        System.out.println("Informe o valor de N: ");
        n = ler.nextInt();

        if (n != 0) {

            for (int i = 1; i < n; i++) {

                if (i % 2 == 0) {
                    h += (float) 1 / i;

                }

                System.out.println("H = " + h);

            }

        }

    }

}
