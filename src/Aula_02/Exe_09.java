package Aula_02;

import java.util.Scanner;

public class Exe_09 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int aux;

        System.out.println("Informe o primeiro numero...");
        int x = ler.nextInt();

        System.out.println("Informe o segundo numero...");
        int y = ler.nextInt();

        System.out.println("Informe o terceiro numero...");
        int z = ler.nextInt();
        
         System.out.println("************************");

        if ((x > y && x > z) && (y > z)) {
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        } else if ((x > y && x > z) && (z > y)) {
            System.out.println(x);
            System.out.println(z);
            System.out.println(y);
        } else if ((y > x && y > z) && (x > z)) {
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        } else if ((y > x && y > z) && (z > x)) {
            System.out.println(y);
            System.out.println(z);
            System.out.println(x);
        } else if ((z > x && z > y) && (x > y)) {
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);
        } else if ((z > x && z > y) && (y > x)) {
            System.out.println(z);
            System.out.println(y);
            System.out.println(x);

        }
            System.out.println("************************");

    }

}
