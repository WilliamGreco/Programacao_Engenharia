
package Aula_01;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exe_07 {
    
    public static void main(String[] args) {
        
        short idade;
        
        Scanner ler = new Scanner(System.in);
        Calendar clr = GregorianCalendar.getInstance();
                
        int anoAtual = clr.get(Calendar.YEAR);
        
        System.out.println("Informe seu nome completo...");
        String nome = ler.nextLine();
        
        System.out.println("Informe seu ano de nascimento... EX: 1986.");
        short ano = ler.nextShort();
        
        idade = (short) (ano-anoAtual);
        
        System.out.println("Prezado " + nome + ", sua idade atual é de... " + idade);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
