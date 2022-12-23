package diegosneves.github.singleton.app;

import diegosneves.github.singleton.exception.TesteException;
import diegosneves.github.singleton.model.TesteSingleton;

public class ExemploSingleton {

    public static void main(String[] args) {

        TesteSingleton um = TesteSingleton.getInstance("Um");
        TesteSingleton dois = TesteSingleton.getInstance("Dois");

        System.out.println(um.getValor());
        System.out.println(dois.getValor());

        var e = new TesteException("TTTTT");
        System.out.println("Deu bom");

        System.out.println(e.getMessage());

        System.out.printf("\n");

        fatorial(0);
        fatorial(1);
        fatorial(5);
        fatorial(10);

        System.out.printf("\n");

        fatorialComFor(0);
        fatorialComFor(1);
        fatorialComFor(5);
        fatorialComFor(10);

    }

    public static void fatorial(Integer valor) {
        Integer cal = fatorialCal(valor);
        System.out.printf("%,d! = %,d\n", valor, cal);
    }

    public static void fatorialComFor(Integer valor) {
        Integer cal = fatorialCalComFor(valor);
        System.out.printf("%,d! = %,d\n", valor, cal);
    }

    private static Integer fatorialCal(Integer valor) {
        if (valor > 1) {
            return valor * fatorialCal(valor - 1);
        }
        return 1;
    }

    private static Integer fatorialCalComFor(Integer valor) {
        Integer resultado = 1;
        for(int i = valor; i >= 1; i--) {
            resultado *= i;
        }
        return resultado;
    }

}
