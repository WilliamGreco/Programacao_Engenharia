package Aula_02;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exe_22 {

    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero inteiro...");
        int num = ler.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este numero é par...");
        } else {
            System.out.println("Este numero é impar...");
        }

    }

}
