package diegosneves.github.singleton.app;

import diegosneves.github.singleton.model.TesteSingleton;

public class ExemploSingleton {

    public static void main(String[] args) {

        TesteSingleton um = TesteSingleton.getInstance("Um");
        TesteSingleton dois = TesteSingleton.getInstance("Dois");

        System.out.println(um.getValor());
        System.out.println(dois.getValor());

    }

}
