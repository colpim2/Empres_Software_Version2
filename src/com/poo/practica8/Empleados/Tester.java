package com.poo.practica8.Empleados;

/** Clase Abstracta **/
public abstract class Tester extends Empleado {

    /** Método Constructor que heredarán las Subclases de Tester **/
    public Tester(String nombre,int ID){
        super(nombre,ID,0);
    }

    /**Método trabajar, el cual heredará cada subclase para utilizar a su manera*/
    public abstract int trabajar();
}
