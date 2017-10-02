package Aula_03;

import java.util.Scanner;

public class Exe_17 {

    public static void main(String[] args) {

        System.out.println("17. Altere o programa anterior para que ele aceite apenas números entre\n"
                + "0 e 1000.");

        Scanner ler = new Scanner(System.in);

        char sair = 'N';
        int num = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE,
                soma = 0;

        while (sair == 'N' || sair == 'n') {
            System.out.print("\nDigite um nº: ");
            num = Integer.parseInt(ler.next());

            while (num < 0 || num > 1000) {
                System.out.println("\nO número deve ser entre 0 e 1000! Digite novamente: ");
                num = Integer.parseInt(ler.next());
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

            soma += num;

            System.out.print("\nsair? (S|N): ");
            sair = ler.next().charAt(0);
        }

        System.out.println("Maior nº: " + maior);
        System.out.println("Menor nº: " + menor);
        System.out.println("Soma: " + soma);
    }

}
