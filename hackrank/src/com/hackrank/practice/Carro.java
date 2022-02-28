package com.hackrank.practice;

//import java.util.Scanner;

public class Carro {

    //colour é um atributo da classe carro
    private String colour;
    String sound;

    // funçao mm nome da class = constructer ---> criar instancias w/ details
    public Carro(String colour, String sound){

        this.colour = colour;
        this.sound = sound;
    }
    //sound é um method
    public void sound() {
        System.out.println("Som do carro:" + this.sound);
    }
    public void colour(){
        System.out.println("Cor do carro:" + this.colour);
    }
    public String getColour(){
        return this.colour;
    }
}
