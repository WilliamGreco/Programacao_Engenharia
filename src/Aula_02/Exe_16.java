package Aula_02;

import java.util.Scanner;

public class Exe_16 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char op;
        
        float delta, raiz, raiz1, raiz2;
        
        
        System.out.println("Informe o valor de A...");
        int a = ler.nextInt();
       
        if (a == 0) {
            System.out.println("Esse valor não corresponde a uma equação do segundo grau");
        }
            
        
        
        
        System.out.println("Informe o valor de B...");
        int b = ler.nextInt();

        System.out.println("Informe o valor de C...");
        int c = ler.nextInt();
        

        delta = (float) (Math.pow(b, 2) - (4 * a * c));

        if (delta < 0) {
            System.out.println(delta + " essa equação não tem valores reais...");
        }
        if (delta == 0) {
            System.out.println(delta + " essa equação não possui raiz...");
            raiz = (float) (((-1) * b + Math.sqrt(delta)) / (2 * a));
            
            System.out.println("A raiz da equação é " + raiz);   
        
        }if(delta > 0){
            System.out.println(delta + " , delta possui duas raizes...");
            
            raiz1 = (float) (((-1)*b + Math.sqrt(delta))/(2*a));
            raiz2 = (float) ((-1)*b - Math.sqrt(delta))/(2*a);
            
            System.out.println("A primeira raiz é " + raiz1);
            System.out.println("A segunda raiz é " + raiz2);
            
        }

    }

}
