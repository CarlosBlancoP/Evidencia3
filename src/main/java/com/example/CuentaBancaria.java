package com.example;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(){
        numeroCuenta = "0000";
        saldo = 0.0;
        titular = "Sin Titular";
    }
    public CuentaBancaria(String num, double sal, String tit){
        numeroCuenta = num;
        if(sal >=0){
            saldo = sal;
        } else {
            saldo =0.0;
        }
        if (tit != null && !tit.isEmpty()){
            titular = tit;
        } else {
            titular = "Sin Titular";
        }
    }
    public String getNumeroCuenta(){
        return  numeroCuenta;
    }
    public void setNumeroCuenta(String num){
        numeroCuenta = num;
    }
    public double getSaldo(double sal){
        return saldo;
    }
    public void setSaldo(double sal){
        saldo = sal;    
    }
    public String titular(){
        return titular;
    }
    public void setTitular(String tit){
        if ( tit != null && !tit. isEmpty()) {
            titular = tit;
        }
    }
    private double cantidad;
    public void depositar(double depositar){
        if (cantidad > 0){
            saldo = saldo + cantidad;
            
        }
    }

}
