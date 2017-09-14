package Aula_02;

import java.util.Scanner;

public class Exe_13 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char op;

        do {

            System.out.println("***********DIAS***DA***SEMANA************");
            System.out.println("Informe um numero correspondete as dias da semana...");
            int semana = ler.nextInt();

            if (semana == 1) {
                System.out.println(semana + " - Domingo");
            } else if (semana == 2) {
                System.out.println(semana + " - Segunda");
            } else if (semana == 3) {
                System.out.println(semana + " - Terça");
            } else if (semana == 4) {
                System.out.println(semana + " - Quarta");
            } else if (semana == 5) {
                System.out.println(semana + " - Quinta");
            } else if (semana == 6) {
                System.out.println(semana + " - Sexta");
            } else if (semana == 7) {
                System.out.println(semana + " - Sábado");
            } else {
                System.out.println(semana + " o valor é inválido...");
            }
                System.out.println("****************************************");
                
            System.out.println("Deseja retornar do inicio (S / N)? :");
            op = ler.next().charAt(0);

        } while (op == 's' || op == 'S');

    }

}
