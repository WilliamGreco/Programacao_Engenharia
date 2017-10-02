package Aula_03;

import java.util.Scanner;

public class Exe_22 {

    public static void main(String[] args) {

        int cont = 0;
        float soma = 0, media;

        Scanner ler = new Scanner(System.in);

        System.out.println("22.	Faça um programa que calcule o valor total investido por um colecionador\n "
                + "em sua coleção de CDs e o valor médio gasto em cada um deles.\n "
                + "O usuário deverá informar a quantidade de CDs e o valor para em cada um.");

        System.out.println("\nPor favor informar a quantidade de Cd: ");
        int cd = ler.nextInt();

        while (cont <= cd) {

            System.out.println("\nPor favor informe o valor do Cd : ");
            float vlr = ler.nextFloat();

            cont = cont + 1;

            soma = soma + vlr;

        }

        media = soma / cd;

        System.out.println("Quantidade de cds é : " + cd);
        System.out.println("Media de gasto foi de : " + media);

    }

}
