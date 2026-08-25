package ArrayEsquenta;

import java.util.*;

public class ParesImpares {

    public static void main() {
        int [] entrada = new int[7];

        entrada = new int[]{1, 2, 3, 4, 5, 6, 7};

        int par = 0;
        int impar = 0;

        for ( int i = 0; i < 7; i++ ) {
           if ( entrada[i] % 2 == 0 ) {
               par++;
           }else {
               impar++;
           }
        }
        int [] ArrayPar = new int[par];
        int [] ArrayImpar = new int [impar];
        int p = 0;
        int im = 0;

        for ( int i = 0; i < 7; i++ ) {
            if ( entrada[i] % 2 == 0 ) {
                ArrayPar[p] = entrada[i];
                p++;
            }else {
                ArrayImpar[im] = entrada[i];
                im++;
            }
        }
        System.out.println( Arrays.toString( entrada ) );
        System.out.println( Arrays.toString( ArrayPar ) );
        System.out.println( Arrays.toString( ArrayImpar ) );
    }

}
