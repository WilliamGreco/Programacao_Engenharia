
package Aula_01;

import java.util.Scanner;


public class Exe_10 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int result;
        int solucion;
        int total;
        
        System.out.println("Informe o valor A, o valor deve ser inteiro...");
        int vlrA = ler.nextInt();
        
        System.out.println("Informe o valor B, o valor deve ser inteiro...");
        int vlrB = ler.nextInt();
        
        System.out.println("Informe o valor C, o valor deve ser inteiro...");
        int vlrC = ler.nextInt();
        
        result =  (int) Math.pow(vlrA + vlrB, 2);
        solucion = (int) Math.pow(vlrB + vlrC, 2);
        
        total = (result + solucion)/2;
        
        
        System.out.println("O resultado da empressão é... " + total);
        
        
        
      
        
        
        
        
    }
    
    
}
