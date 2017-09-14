package Aula_02;

import java.util.Scanner;

public class Exe_03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu sexo...");
        String sexo = ler.next();

        if (sexo.equals("f") && (sexo.equals("F"))) {
            System.out.println(sexo + " - Feminino.");

        } else if (sexo.equals("m") && (sexo.equals("M"))) {
            System.out.println(sexo + " - Masculino.");

        } else {
            System.out.println("Sexo Invalido.");
        }

    }

}
