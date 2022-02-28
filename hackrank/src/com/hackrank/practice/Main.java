package com.hackrank.practice;

public class Main {

    // todas os programas precisam desta funçao com esta sign
    public static void main(String[] args) {

        System.out.println("Hello World");

        // criar instancias de Carro
        Carro carro1 = new Carro("red", "brrrrr");

        Carro carro2 = new Carro("blue", "GRRRRRR");

        System.out.println("\nCarro 1");

        carro1.sound();
        carro1.colour();
        //System.out.println("Cor do carro: " + carro1.colour);

        System.out.println("\nCarro 2");

        carro2.sound();
        carro2.colour();
        //System.out.println("Cor do carro: " + carro2.colour);
    }

}
