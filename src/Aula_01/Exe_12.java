
package Aula_01;

import java.util.*;

public class Exe_12 {
    
    public static void main(String[] args) {
        
        float salarioB,salarioIR,salarioInss, salarioSind, salarioLiquido;
            
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o valor de sua hora trabalhada...");
        float vlrTrab = ler.nextFloat();
        
        System.out.println("Informe o valor da quantidade de horas trabalhada no mês...");
        float qtTrab = ler.nextFloat();
        
        salarioB = vlrTrab * qtTrab;
        
         float ir = (float) 0.11;
        
        salarioIR = salarioB * ir;
        
        float inss = (float) 0.08;
        
        salarioInss = salarioB * inss;
        
        float sind = (float) 0.05;
        
        salarioSind = salarioB * sind; 
        
        salarioLiquido = (salarioB) - (salarioIR + salarioInss + salarioSind) ;
        
        System.out.println("Prezado, seu salario bruto é... " + salarioB + ", você pagou de IR o valore de R$ " + salarioIR + ", de INSS o valor de R$ " + salarioInss + 
        ", e de sindicato o valor de R$  " + salarioSind + ", sendo assim seu salario liquido será de R$ " + salarioLiquido);
        
        
        
    }
    
    
}
