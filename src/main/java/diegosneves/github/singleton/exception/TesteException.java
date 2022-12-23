package diegosneves.github.singleton.exception;

public class TesteException extends RuntimeException{

    public TesteException() {
        System.out.println("Deu ruim");
    }

    public TesteException(String message) {
        super(message);
    }
}
