package Aula_02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exe_18 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma data no formato dia, mês e ano - DD/MM/AAAA.");
        String s = ler.nextLine();
       
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient (false); 
        try {
            System.out.println(df.parse (s));
          
        } catch (ParseException ex) {
           System.out.println(ex);
        }
    }
    
}
