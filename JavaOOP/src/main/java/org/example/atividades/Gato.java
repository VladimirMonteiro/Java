package org.example.atividades;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public boolean arranharMoveis(){
        return true;
    }
}
