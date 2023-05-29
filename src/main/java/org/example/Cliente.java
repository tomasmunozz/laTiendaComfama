package org.example;

public class Cliente {

    //Atributos (variables que almacenan datos de la clase)
    private String nombre;
    public int edad; //dato primitivo
    public String telefono; //dato en envoltura(mayuscula al declaraar)
    public String direccion;
    public Integer comprasAlMes;
    //Metodos especiales

    //1. constructor vacio
    public Cliente() {
    }
    //2. constructor lleno

    public Cliente(String nombre, int edad, String telefono, String direccion, Integer comprasAlMes) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comprasAlMes = comprasAlMes;
    }


//Metodos ordinarios


}
