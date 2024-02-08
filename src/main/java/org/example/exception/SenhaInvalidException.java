package org.example.exception;

public class SenhaInvalidException extends RuntimeException {
    public SenhaInvalidException() {
        super("Senha inválida.");
    }
}
