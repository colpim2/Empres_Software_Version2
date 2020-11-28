package com.poo.practica8.Empleados;

public class Desarrollador extends Empleado{
    /** Método Constructor **/
    public Desarrollador(String nombre,int ID){
        super(nombre,ID,0);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());
    }

    /** Sobrescritura de toString **/
    public String toString(){
        return "\nDESARROLLADOR: " + getNombre();
    }

    /** Método Trabajar **/
    public int trabajar(){
        int horasJornada = 0;
        System.out.println("\t << HORA DE TRABAJAR >> ");
        horasJornada  += obtenerLogicaDelPrograma();
        horasJornada  += desarrollarCodigo();
        horasJornada  += debugearCodigo();
        horasJornada  += optimizarCodigo();
        return horasJornada ;
    }

    /** Métodos simulación **/
    private int obtenerLogicaDelPrograma(){
        System.out.println("Investigando definiciones en internet");
        return 3;
    }

    private int desarrollarCodigo(){
        System.out.println("Implementando Hola Mundo");
        return  2;
    }

    private int debugearCodigo(){
        System.out.println("Error encontrado: Falto ;");
        return 4;
    }

    private int optimizarCodigo(){
        System.out.println("Eliminando 50 renglones vacios y 4 variables sin usar");
        return 1;
    }

}
