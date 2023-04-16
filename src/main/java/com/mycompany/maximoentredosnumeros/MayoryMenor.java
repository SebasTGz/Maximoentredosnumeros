
package com.mycompany.maximoentredosnumeros;
import java.util.Scanner;
public class MayoryMenor {

    public static void main(String[] args) {

        Scanner test=new Scanner(System.in);

        System.out.println("--DETERMINAR EL NUMERO MAYOR Y MENOR--");
        System.out.println("Ingrese la cantidad de numeros enteros a evaluar a continuacion...");

        int cantidadNumeros = test.nextInt();

        int numeroMenor = 0;
        int numeroMayor = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Digite el numero en la posicion..." + (i + 1));
            int tmp = test.nextInt();
            if (i == 0) {
                numeroMenor = tmp;
                numeroMayor = tmp;
            } else if (tmp < numeroMenor) {
                numeroMenor = tmp;
            }
            if (tmp > numeroMayor) {
                numeroMayor = tmp;
            }
        }

        
        System.out.println("El numero menor es..." + numeroMenor);
        System.out.println("El numero mayor es..." + numeroMayor);
        
        System.out.println("--FIN DEL PROGRAMA--");
    }
}
