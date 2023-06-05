package org.example;

public class Cliente {

    //Atributos (variables que almacenan datos de la clase)
    private String nombre;
    private int edad; //dato primitivo
    private String telefono; //dato en envoltura(mayuscula al declaraar)
    private String direccion;
    private Integer comprasAlMes;
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

    //3. Metodos de encapsulado (getters & setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //validar que el nombre que llega tengaalmenos 4 letras
        this.nombre = nombre;
    }

    public int getEdad() {
            return edad;
    }

    public void setEdad(int edad) {
        if (edad>120){
            System.out.println("la edad no es valida");
        }
        else {
            this.edad = edad;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) { //validar que el tel tenga 10 digitos
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getComprasAlMes() {
        return comprasAlMes;
    }

    public void setComprasAlMes(Integer comprasAlMes) { //validar q no hayan compras negativas
        if (comprasAlMes<0){
            System.out.println("No se admiten compras negativas");
        }else {
            this.comprasAlMes = comprasAlMes;
        }
    }


    //Metodos ordinarios


}
