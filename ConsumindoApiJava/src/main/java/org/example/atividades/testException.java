package org.example.atividades;

public class testException extends Throwable{
    private String message;
    public testException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
