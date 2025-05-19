package day52_Errors_Exceptions.Exceptions;

public class AgeException extends RuntimeException { // Unchecked Exception


    public AgeException(String message) {
        super(message);
    }
}
