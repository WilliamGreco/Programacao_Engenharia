package Aula_01;

import java.util.Scanner;

public class Exe_09 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        float centígrados;
        
        System.out.println("Informe seu nome completo...");
        String nome = ler.nextLine();
        
        System.out.println("Informe a temperatura em graus Farenheit...");
        float f = ler.nextFloat();
        
        
        centígrados = (float) ( 5 * f - 160)/9;
        
        System.out.println("Prezado " + nome + ", o valor convertido para centígrados será: " + centígrados);
        
        
    }
}
