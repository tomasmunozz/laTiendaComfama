package org.example.clases;

public class Empleado {

    //atributos
    private Integer salario;
    private String nombre;

    //metodos especiales

    //1.constructor vacio
    public Empleado(){}

    //2.constructor lleno
    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        if (salario<0){
            System.out.println("Tu salario es invalido");
        }
        else {
            this.salario = salario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos ordinarios
    //Los metodosordinarios seran funciones que el desarrollador programe para ejecutar las logica de negocio

    //calcular el salario de un empleado
    public Double calcularSalario (Integer salarioBase, Integer deducciones){

       final Double descuentoSalud = 0.04;
       final Double descuentoPension = 0.04;

       Double descuentoSeguridadSocial = (salarioBase*descuentoSalud*descuentoPension);
       Double salario=salarioBase-deducciones-descuentoSalud;

       return salario;

    }
}













