package aula_02;

import java.util.*;
import java.io.*;

public class Loop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int termoAtual = a;
            for ( int j = 0; j < n; j++ ) {
                termoAtual += ( 1 << j ) * b;
                System.out.print( termoAtual + " " );
            }
            System.out.println();
        }
        in.close();
    }
}
