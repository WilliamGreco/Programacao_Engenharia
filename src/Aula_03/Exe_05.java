package Aula_03;

import java.util.Scanner;

public class Exe_05 {

    public static void main(String[] args) {
        
        System.out.println("5. Faça um programa que leia 5 números e informe o maior número.");
        
        Scanner ler = new Scanner(System.in);
        int contNum = 0, maior = Integer.MAX_VALUE, num;
        
        while(contNum <= 4) {
            System.out.print("\nDigite o número " + (contNum + 1) + ": ");
            num = ler.nextInt();
            
            if(num > maior) {
                maior = num;
            }
            contNum++;
        }
        
        System.out.println("\nO maior número é: " + maior);
        
    }
    
}
