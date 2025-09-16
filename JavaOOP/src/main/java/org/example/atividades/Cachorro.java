package org.example.atividades;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public boolean abanarRabo(){
        return true;
    }
}
