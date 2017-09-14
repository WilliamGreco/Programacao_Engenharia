package Aula_02;

import java.util.Scanner;

public class Exe_11 {

    public static void mostraSalario(float salario, float percentagem) {
        float rea = (float) (salario + (percentagem * salario));

        System.out.println("**************************");
        System.out.println("***Informativo de Salario***");
        System.out.println("Salario base de: R$ " + salario);
        System.out.println("O Percentual de Aumento é " + (percentagem * 100) + "%");
        System.out.println("O Valor do Aumento de: R$ " + percentagem * salario);
        System.out.println("Seu novo salario é de: R$ " + rea);
        System.out.println("**************************");
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char op;

        do {
            System.out.println("Informe o seu salario...");

            float salario = ler.nextFloat();

            if (salario <= 280) {
                mostraSalario(salario, 0.20f);
            } else if (salario <= 700) {
                mostraSalario(salario, 0.15f);
            } else if (salario <= 1500) {
                mostraSalario(salario, 0.10f);
            } else {
                mostraSalario(salario, 0.05f);
            }

            System.out.println("Deseja repetir a consulta (S / N)? : ");
            op = ler.next().charAt(0);

        } while (op == 's' || op == 'S');
    }
}
