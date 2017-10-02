package Aula_03;

import java.util.Scanner;

public class Exe_09 {

    public static void main(String[] args) {

        System.out.println("9. Altere o programa anterior para mostrar no final a soma dos números.");

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = ler.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = ler.nextInt();

        int soma = 0;

        System.out.println("Intervalo: ");

        while (n1 <= n2) {
            System.out.print(n1 + " ");
            soma += n1;
            n1++;
        }

        System.out.println();
        System.out.println("Soma dos números = " + soma);
    }

}
