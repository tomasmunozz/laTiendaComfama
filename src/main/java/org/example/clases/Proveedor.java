package org.example.clases;

public class Proveedor {
    private String id;
    private String nombre;
    private String nit;
    private String descripcion;
    private String direccion;

    public Proveedor() {
    }

    public Proveedor(String id, String nombre, String nit, String descripcion, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
