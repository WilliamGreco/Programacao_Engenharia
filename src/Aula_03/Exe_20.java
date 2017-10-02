package Aula_03;

import java.util.ArrayList;
import java.util.List;

public class Exe_20 {

    public static void main(String[] args) {

        System.out.println("20.	Altere o programa de cálculo dos números primos, informando, "
                + "caso o número não seja primo, por quais número ele é divisível.");

        List<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i <= 70; i++) {
            numeros.add(i);
        }
        int contador;
        int numero = 0;
        for (Integer i : numeros) {
            contador = 0;
            for (int u = 1; u <= i; u++) {
                if (i % u == 0) {
                    contador++;
                    numero = u;
                }
            }
            if (contador == 2) {
                System.out.println("\nO Número: " + numero + " é primo e seus primos são: 1 e " + numero);
            }
        }

    }

}
