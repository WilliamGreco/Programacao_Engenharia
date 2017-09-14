
package Aula_01;

import java.util.Scanner;

public class Exe_08 {
    
    public static void main(String[] args) {
        
        float hipotenusa;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o seu nome completo...");
        String nome = ler.nextLine();
        
        System.out.println("Informe o valor do primeiro cateto...");
        float cateto1 = ler.nextFloat();
        
        System.out.println("Informe o valor do segundo cateto... ");
        float cateto2 = ler.nextFloat();
        
        hipotenusa = (float) (Math.sqrt(cateto1 * cateto2)+ (cateto1 * cateto2));
        
        System.out.println("Prezado " + nome + ", o valor da hipotenusa será de... " + hipotenusa);
        
        
        
        
    }
    
    
}
