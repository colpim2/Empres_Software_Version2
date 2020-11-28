package com.poo.practica8.Empleados;

public class TesterUsuario extends Tester{
    /** Método Constructor **/
    public TesterUsuario(String nombre,int ID){
        super(nombre,ID);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());
    }

    /** Sobrescritura de toString **/
    public String toString(){
        return "\nTESTER USUARIO: " + getNombre();
    }

    /** Método Trabajar **/
    public int trabajar(){
        int horasJornada = 0;
        System.out.println("\t << HORA DE TRABAJAR >> ");
        horasJornada  += testearInterfazDeUsuario();
        horasJornada  += proveerFeedback();
        horasJornada  += finalizarReporte();
        return horasJornada ;
    }

    /** Métodos simulación **/
    private int testearInterfazDeUsuario(){
        System.out.println("¿Qué tan intuituvo es el programa?");
        return 3;
    }

    private int proveerFeedback(){
        System.out.println("Considero que algunas personas no podran acceder facilmente esta parte del programa");
        return 2;
    }

    private int finalizarReporte(){
        System.out.println("Reporte finalizado");
        return  2;
    }
}
