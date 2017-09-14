
package Aula_02;

import java.util.Scanner;

public class Exe_10 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        char op;
        
        do{
    
        System.out.println("Informe seu turno de trabalho. M-Matutino V-Vespertino N-Noturno.");
        String turno = ler.nextLine();
        
        if(turno.equals("m") || turno.equals("M")){
            System.out.println("Bom Dia!");
        }else if(turno.equals("v") || turno.equals("V")){
            System.out.println("Boa Tarde!");
        }else if(turno.equals("n") || turno.equals("N")){
            System.out.println("Boa Noite!");
        }else
            System.out.println("Inválido!!!");
        
        System.out.println("Deseja repetir a consulta (S / N)? : ");
            op = ler.next().charAt(0);

        } while (op == 's' || op == 'S');
        
        
    }
    
}
