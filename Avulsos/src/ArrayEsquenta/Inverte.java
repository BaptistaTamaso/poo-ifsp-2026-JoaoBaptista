package ArrayEsquenta;

import java.util.*;

public class Inverte {

    public static void main() {
        int [] entrada = new int[5];
        entrada = new int[]{10, 20, 30, 40, 50};

        int [] saida = new int[5];

        for ( int i = 0; i < 5; i++ ) {
            saida [i] = entrada[5-i-1];
            System.out.println( saida[i] );
        }
    }

}
