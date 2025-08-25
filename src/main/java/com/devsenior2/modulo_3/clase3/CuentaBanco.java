package com.devsenior2.modulo_3.clase3;

public class CuentaBanco {
    private double saldo;

    public CuentaBanco(double saldo) {
        this.saldo = saldo;
    } 

    public void retirar(double monto)throws SaldoInsuficienteException{
        if(monto > saldo){
            throw new SaldoInsuficienteException("No tienes suficiente saldo para retirar "); 
        }

        saldo -= monto; 
        System.out.println("Retiro exitoso");
    }
}
