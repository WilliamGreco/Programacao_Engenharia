
package Aula_02;

import java.util.Scanner;

public class Exe_20 {
    
    
    public static void main(String[] args) {

        float media;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a nota U1...");
        float u1 = ler.nextFloat();
        
        System.out.println("Informe a nota U2...");
        float u2 = ler.nextFloat();
        
        System.out.println("Informe a nota U3...");
        float u3 = ler.nextFloat();

        media = (u1 + u2 + u3) / 3;

        if (media >= 7) {
            System.out.println("Você foi APROVADO!!!");
        } else if (media < 7) {
            System.out.println("Você foi REROVADO!!!");
        }

        if (media == 10) {
            System.out.println("Você foi APROVADO COM DISTINÇÃO!!!");
        }

    }

}

    

