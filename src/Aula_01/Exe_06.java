
package Aula_01;

import java.util.Scanner;

public class Exe_06 {
    
    public static void main(String[] args) {
        
        double salarioBruto, salarioLiquido, descontoINSS;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("*********Calculo de salario liquido*********");
        
        System.out.println("Informe o valor da aula...");
        float vlrAula = ler.nextFloat();
        
        System.out.println("Informe o numero de aulas dadas...");
        float ald = ler.nextFloat();
        
        System.out.println("Informe o valor de desconto do INSS...");
        float inss = ler.nextFloat();
        
        salarioBruto = vlrAula * ald;
        descontoINSS = salarioBruto * (inss / 100);
        salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.println("O salario liquido do professor é de R$... " + salarioLiquido);
               
        
        
        
        
    }
    
}
