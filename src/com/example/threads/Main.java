package com.example.threads;

public class Main {

    public static void main(String[] args){
        Cajero cajero = new Cajero();
cajero.retirarDinero(10);
        Thread usuario1 = new Thread(cajero, "usuario1");
        Thread usuario2 = new Thread(cajero, "usuario2");



        usuario1.start();

        usuario2.start();
    }

}
