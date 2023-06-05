package org.example.clases;

public class Administrador {

    private String nombres;
    private Double salario;
    private String correo;
    private Boolean jornada;

    public Administrador() {
    }

    public Administrador(String nombres, Double salario, String correo, Boolean jornada) {
        this.nombres = nombres;
        this.salario = salario;
        this.correo = correo;
        this.jornada = jornada;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) { //validar que el nombre que llega tengaalmenos 20 letras
        this.nombres = nombres;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if (salario<0){
            System.out.println("Tu salario es no valido ");
        }
        else {
            this.salario = salario;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getJornada() {
        return jornada;
    }

    public void setJornada(Boolean jornada) {
        this.jornada = jornada;
    }
}
