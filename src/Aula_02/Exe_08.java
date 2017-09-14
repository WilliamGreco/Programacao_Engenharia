package Aula_02;

import java.util.Scanner;

public class Exe_08 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char op;
        
        do{
        
        System.out.println("Informe o valor do primeiro produto...");
        float num1 = ler.nextFloat();

        System.out.println("Informe o valor do segundo produto...");
        float num2 = ler.nextFloat();

        System.out.println("Informe o valor do terceiro produto...");
        float num3 = ler.nextFloat();

        if (num1 < num2 && num1 < num3) {
            System.out.println("O primeiro produto de  " + num1 + " é o mais barato.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O segundo produto de  " + num2 + " é o mais barato.");
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("O terceiro produto de  " + num3 + " é o mais barato.");
        }
          
            System.out.println("Deseja repetir a consulta (S / N)? :");
            op = ler.next().charAt(0);
            
        }while(op == 's' || op == 'S');
        
    }

}
