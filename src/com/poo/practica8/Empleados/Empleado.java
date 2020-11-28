package com.poo.practica8.Empleados;

/**Clase Abstracta*/
public abstract class Empleado {
    private String nombre;
    private int ID;
    private double salario;
    private int horasDeTrabajo;

    /**Método constructor que heredarán las Subclases de Empleado*/
    public Empleado(String nombre, int ID,int horasDeTrabajo) {
        this.nombre = nombre;
        this.ID = ID;
        this.horasDeTrabajo = horasDeTrabajo;
    }

    /**Métodos geters y seters para manipulación de atributos privados*/
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**Método trabajar, el cual heredará cada subclase para utilizar a su manera*/
    public abstract int trabajar();
}
