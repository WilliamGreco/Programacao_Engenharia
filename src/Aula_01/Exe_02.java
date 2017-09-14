
package Aula_01;

import java.util.Scanner;

public class Exe_02 {
    
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
       
    float reajuste;
    
    
        System.out.println("Informe o valor desejado...");
        float vlr = ler.nextFloat();
        
        
        reajuste = (float) (vlr*0.1/100);
        
        System.out.println("O valor do reajuste em 10% é de " + vlr);
        
    

        
    }
    
}
