package com.example.threads;

public class Cuenta {

    Integer saldo = 100;

    public int getSaldo(){
        return saldo;
    }

    public void realizarRetiro(int valor){
        saldo -= valor;
    }

}
