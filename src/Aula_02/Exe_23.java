package Aula_02;

import java.util.Scanner;

public class Exe_23 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
         
        System.out.println("Informe um numero...");
        float num = ler.nextInt();

             
        if(num % num == 0){
            System.out.println("Este numero é inteiro...");
        }else{
             System.out.println("Este numero é decimal...");
        }
        

    }

}
