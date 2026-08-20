package aula_02;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 1;

        while ( scan.hasNext() ) {
            String linha = scan.nextLine();
            System.out.println(i + " " + linha);
            i++;
        }
        scan.close();
    }
}