
package Aula_01;

import java.util.Scanner;


public class Exe_03 {
    
    public static void main(String[] args) {
        
        float media;
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Informe o primeiro valor...");
        float vlr1 = ler.nextFloat();
                
        System.out.println("Informe o segundo valor...");
        float vlr2 = ler.nextFloat();
        
        System.out.println("Informe o terceiro valor...");
        float vlr3 = ler.nextFloat();
        
        media = (vlr1 + vlr2 + vlr3/3);
        
        System.out.println("Sua media é de... " + media);
        
        
        
        
    }
    
}
