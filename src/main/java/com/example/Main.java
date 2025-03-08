package com.example;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setTitular("Rodrido");
        cuenta1.depositar(250.50);

        CuentaBancaria cuenta2 = new CuentaBancaria("14782369", 5251.00, "Maria");
        cuenta2.depositar(458.62);


        System.out.println("Cuenta 1 " + cuenta1.getNumeroCuenta() + " Saldo : " + cuenta1.getSaldo(0) + " Titular : " + cuenta1.titular() );
        System.out.println("Cuenta 2 " + cuenta2.getNumeroCuenta() + " Saldo : " + cuenta2.getSaldo(0) + "Titular : " + cuenta2.titular() );

    }

}
///Responde las siguientes preguntas:
/// 
///¿Por qué es importante encapsular los atributos como privados?
/// Porque nos ayuda a evitar modificarlos por fuera de la clase y estos siempre
/// estan en un estado valida.
/// 
///¿Qué ventaja tiene usar constructores sobrecargados en esta clase?
/// Al tener constructores con diferentes parametros, esto nos permite
/// o da flexibilidad al crear mas objetos diferentes
/// 
///¿Cómo aseguran los setters la integridad de los datos?
/// Estos nos ayuda controlar los valores de las variables por medio de
/// valoraciones, y podemos cambiarlos facilmente.