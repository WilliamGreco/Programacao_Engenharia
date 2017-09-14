
package Aula_01;

import java.util.Scanner;

public class Exe_05 {
    
    public static void main(String[] args) {
        
        float desconto;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o preço de um produto...");
        float prd = ler.nextFloat();
        
        desconto = (float) (prd - 0.9/100);
        
        System.out.println("O valor do preço que foi informado com um desconto de 9% será de... " + desconto);
        
        
        
        
        
        
    }
    
}
