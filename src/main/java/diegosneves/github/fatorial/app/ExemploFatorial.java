package diegosneves.github.fatorial.app;

import diegosneves.github.fatorial.enums.Fatorial;

public class ExemploFatorial {

    public static void main(String[] args) {


        imprimirFatorial(0, Fatorial.RECURSIVO);
        imprimirFatorial(1, Fatorial.RECURSIVO);
        imprimirFatorial(5, Fatorial.RECURSIVO);
        imprimirFatorial(10, Fatorial.RECURSIVO);

        System.out.printf("\n");

        imprimirFatorial(0, Fatorial.FOR);
        imprimirFatorial(1, Fatorial.FOR);
        imprimirFatorial(5, Fatorial.FOR);
        imprimirFatorial(10, Fatorial.FOR);


    }

    public static void imprimirFatorial(Integer valor, Fatorial fatorialType) {
        Integer cal = fatorialType.fatorial(valor);
        System.out.printf("%,d! = %,d\n", valor, cal);
    }

}
