
package Aula_01;

import java.util.Scanner;

public class Exe_01 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero inteiro...");
        int numero = ler.nextInt();

        int sucessor = numero + 1;
        System.out.println("\nO numero sucessor é..." + sucessor);
        int antecessor = numero - 1;
        System.out.println("\nO numero antecessor é..." + antecessor);

    }

}