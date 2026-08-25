package ArrayEsquenta;

import java.lang.reflect.Array;
import java.util.*;

public class Inverte {

    public static void main() {
        int [] entrada = new int[5];
        entrada = new int[]{10, 20, 30, 40, 50};

        int [] saida = new int[5];

        for ( int i = 0; i < entrada.length; i++ ) {
            saida [i] = entrada[entrada.length-i-1];
            System.out.println( saida[i] );
        }
    }

}
