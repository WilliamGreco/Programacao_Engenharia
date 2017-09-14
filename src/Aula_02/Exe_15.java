package Aula_02;

import java.util.Scanner;

public class Exe_15 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char op;

        do {
            System.out.println("***QUE**TIPO**É**TRIAGULO**EUILÁTERO**ISÓSCELES**ESCALENO***");

            float tri, eq, iso, esc;

            System.out.println("Informe o valor da primeiro lado...");
            float l1 = ler.nextFloat();

            System.out.println("Informe o valor do segundo lado...");
            float l2 = ler.nextFloat();

            System.out.println("Informe o valor do terceiro lado...");
            float l3 = ler.nextFloat();

            if (l1 + l2 > l3) {
                if (1 == l2 && l1 == l3) {
                    System.out.println("Os lados formaram um Triângulo Equilátero.");
                } else if (l1 == l2 || l2 == l3 || l1 == l3) {
                    System.out.println("Os lados formaram um Triângulo Isósceles.");
                } else if (l1 != l2 || l1 != l3 || l2 != l3) {
                    System.out.println("Os lados formaram um Triângulo Escaleno.");
                } else {
                    System.out.println("Não é um triângulo...");
                }
                System.out.println("*********************************************************************");

            }

            System.out.println("Deseja repetir a consulta (S / N)? :");
            op = ler.next().charAt(0);

        } while (op == 's' || op == 'S');

    }

}
