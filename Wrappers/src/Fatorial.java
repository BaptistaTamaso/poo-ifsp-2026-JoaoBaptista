package app;

import java.util.Scanner;

public class Fatorial {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite n: ");
        Integer n = teclado.nextInt();
        teclado.close();

        Integer fatorial = 1;

        for(Integer i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }
        System.out.println(n + "! = " + fatorial);
    }
}
