
package Aula_01;

import java.util.Scanner;

public class Exe_11 {
    
    public static void main(String[] args) {
        
        float distancia;
        
        Scanner ler = new Scanner(System.in);
        
       
        System.out.println("Informe o seu nome completo...");
        String nome = ler.nextLine();
        
        System.out.println("Informe o valor de X1...");
        float x1 = ler.nextFloat();
        
        System.out.println("Informe o valor de X2...");
        float x2 = ler.nextFloat();
        
        System.out.println("Informe o valor de Y1...");
        float y1 = ler.nextFloat();
        
        System.out.println("Informe o calor de Y2...");
        float y2 = ler.nextFloat();
        
              
        distancia = (float) Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        
        System.out.println("Prezado " + nome + ", a distancia entre os pontos informados são... " + distancia);
        
        
        
        
        
        
        
    }
}