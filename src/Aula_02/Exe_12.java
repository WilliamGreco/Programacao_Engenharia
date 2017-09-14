package Aula_02;

import java.util.Scanner;

public class Exe_12 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        char op;
        
        do{
        
        float salario, inss, fgts, descA, descB, descC, descD, sind;

        System.out.println("Informe o valor da hora...");
        float horaVlr = ler.nextFloat();

        System.out.println("Informe a quantidade de horas trabalhadas...");
        float horaTrab = ler.nextFloat();
        

            salario = horaTrab * horaVlr;

            descA = (5 / 100) * salario;
            descB = (10 / 100) * salario;
            descC = (20 / 100) * salario;
            descD = (0 / 100) * salario;
            sind = (3 / 100) * salario;
            inss = (10 / 100) * salario;
            fgts = (11 / 100) * salario;

            if (salario <= 900) {
                System.out.println("Seu salario Bruto é de R$: " + (salario));
                System.out.println("(-) IR (0%): " + descD);
                System.out.println("(-) INSS ( 10%) R$: " + inss);
                System.out.println("FGTS (11%) R$: " + fgts);
                System.out.println("Seu total de descontos foi R$: " + (sind + inss + descD));
                System.out.println("Seu salario liquido foi R$: " + (salario - (sind + inss + descD)));
            } else if (salario <= 1500) {
                System.out.println("Seu salario Bruto é de R$: " + (salario - inss));
                System.out.println("(-) IR (5%) R$: " + descA);
                System.out.println("(-) INSS ( 10%) R$: " + inss);
                System.out.println("FGTS (11%) R$: " + fgts);
                System.out.println("Seu total de descontos foi R$: " + (sind + inss + descA));
                System.out.println("Seu salario liquido foi R$: " + (salario - (sind + inss + descA)));
            } else if (salario <= 2500) {
                System.out.println("Seu salario Bruto é de R$: " + (salario));
                System.out.println("(-) IR (10%) R$: " + descB);
                System.out.println("(-) INSS ( 10%) R$: " + inss);
                System.out.println("FGTS (11%) R$: " + fgts);
                System.out.println("Seu total de descontos foi R$: " + (sind + inss + descB));
                System.out.println("Seu salario liquido foi R$: " + (salario - (sind + inss + descB)));
            } else if (salario > 2500) {
                System.out.println("Seu salario Bruto é de R$: " + (salario));
                System.out.println("(-) IR (20%) R$: " + descC);
                System.out.println("(-) INSS ( 10%) R$: " + inss);
                System.out.println("FGTS (11%) R$: " + fgts);
                System.out.println("Seu total de descontos foi R$: " + (sind + inss + descC));
                System.out.println("Seu salario liquido foi R$: " + (salario - (sind + inss + descC)));

            }

            System.out.println("Deseja repetir a consulta (S / N)? :");
            op = ler.next().charAt(0);
            
        }while(op == 's' || op == 'S');

    }
}
