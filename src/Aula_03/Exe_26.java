package Aula_03;

import java.util.Scanner;

public class Exe_26 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i, n;

        System.out.printf("Informe o número para a tabuada:\n");
        n = ler.nextInt();

        System.out.printf("\n+--Resultado--+\n");
        for (i = 1; i <= 10; i++) {
            System.out.printf("| %2d * %d = %2d |\n", i, n, (i * n));
        }
        System.out.printf("+-------------+\n");
    }

}
