package aula_02;

import java.util.Scanner;

public class StdinStdout1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        scan.close();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}
