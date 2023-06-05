package org.example;

import org.example.clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear objeto especial de java para recibir datos por teclado(Scanner)

        Scanner entradaPorTeclado= new Scanner(System.in);


        //crear objeto de la casa cliente
        Cliente cliente = new Cliente();

        //pidiendo nombre del usuario
        System.out.println("Digita tu edad: ");
        cliente.setEdad(entradaPorTeclado.nextInt());
        System.out.println("la edad es: "+cliente.getEdad());

    }
}