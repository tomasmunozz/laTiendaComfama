package org.example;

import org.example.clases.Empleado;

public class Main {
    public static void main(String[] args) {

        //dentro del metodo main escribo mi programa y creo los objetos
        //creando una variable ordinaria
        int edad=5;
        System.out.println(edad);

        //creando mi primer objeto
        // los objetos son copias de una clase
        // los objetos son instancias de una clase
        // los objetos son variables que se crean para poder inicializar
        // los atributos de una clase
        Cliente objeto=new Cliente();
        // yo uso un objeto para acceder a los atributos y metodos por separado
        objeto.edad=18;
        objeto.nombre="Thomas";
        System.out.println(objeto.edad);
        System.out.println(objeto.nombre);



        //creando un objeto usando un constructor lleno
        Cliente objetoDos=new Cliente("Catalina",16,"392047838","cll 30",10);
        System.out.println(objetoDos.edad);
        System.out.println(objetoDos.nombre);


        //creando un objeto de la clase empleado
        Empleado objetoTres=new Empleado();
        System.out.println(objetoTres.);
        






    }
}