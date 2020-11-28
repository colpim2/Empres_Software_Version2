package com.poo.practica8.Empleados;

public class Disenador extends Empleado{
    /** Método Constructor **/
    public Disenador(String nombre, int ID){
        super(nombre,ID,0);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());
    }

    /** Sobrescritura de toString **/
    public String toString(){
        return "\nDISEÑADOR: " + getNombre();
    }

    /** Método Trabajar Sobreescritura adaptada a la subclase Disenador**/
    public int trabajar(){
        System.out.println("\t << HORA DE TRABAJAR >> ");
        int horasLaborales = 0;
        horasLaborales += investigarDisenos();
        horasLaborales += pensarEnDisenos();
        horasLaborales += establecerColores();
        horasLaborales += dibujar();
        horasLaborales += establecerNuevoSlogan();
        return horasLaborales;
    }

    /** Métodos simulación **/
    public int investigarDisenos(){
        System.out.println("Investigando diseños");
        return 1;
    }

    public int pensarEnDisenos(){
        System.out.println("Imaginando un nuevo diseño");
        return 2;
    }

    public int establecerColores(){
        System.out.println("El color perfecto para este diseño es...");
        return 1;
    }

    public int dibujar(){
        System.out.println("Este diseño será el mejor de todos");
        return 5;
    }

    public int establecerNuevoSlogan(){
        System.out.println("Nuevo Slogan: \"Imaginalo y hazlo\"");
        return  1;
    }
}
