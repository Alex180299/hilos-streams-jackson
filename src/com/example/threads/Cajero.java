package com.example.threads;

public class Cajero implements Runnable {

    Cuenta cuenta = new Cuenta();

    public void run() {
        for (int i = 0; i < 5; i++){
            try {

                retirarDinero(20);

                if(cuenta.getSaldo() < 0){
                    System.out.println("****Cuenta en negativos****");
                }

                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void retirarDinero(int retiro){
        System.out.println("---- Inicia retiro ----");

        synchronized (cuenta.saldo){
        if(cuenta.getSaldo() >= retiro){
            System.out.println("Usuario: " + Thread.currentThread().getName());
            System.out.println("Saldo actual: " + cuenta.getSaldo());
            System.out.println("Retiro: " + retiro);

            cuenta.realizarRetiro(retiro);


            System.out.println("Retiro exitoso, nuevo saldo: " + cuenta.getSaldo());
        }else{
            System.out.println("No hay saldo suficiente para realizar la transaccion");
        }
        }
    }
}
