package Aula_03;

import java.util.Scanner;

public class Exe_18 {

    public static void main(String[] args) {

        System.out.println("18. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular\n"
                + "o fatorial várias vezes e limitando o fatorial a números inteiros positivos \n"
                + "e menores que 16.");

        Scanner ler = new Scanner(System.in);

        System.out.print("\nDigite um nº: ");
        int fat = ler.nextInt();

        while (fat < 0 || fat > 16) {
            System.out.println("\nO nº deve ser positivo e menor que 16! "
                    + "Digite novamente: ");
            fat = ler.nextInt();
        }

        int i = fat - 1;

        while (i > 0) {
            fat *= i;
            i--;
        }

        System.out.println("\nResultado = " + fat);
    }

}
