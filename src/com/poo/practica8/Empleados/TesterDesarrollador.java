package com.poo.practica8.Empleados;

public class TesterDesarrollador extends Tester{
    /** Método Constructor **/
    public TesterDesarrollador(String nombre,int ID){
        super(nombre,ID);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());
    }

    /** Sobrescritura de toString **/
    public String toString(){
        return "\nTESTER DESARROLLADOR: " + getNombre();
    }

    /** Método Trabajar **/
    public int trabajar(){
        int horasJornada = 0;
        System.out.println("\t << HORA DE TRABAJAR >> ");
        horasJornada  += testearLogicaDelPrograma();
        horasJornada  += encontrarBugs();
        horasJornada  += proveerOptimizaciones();
        horasJornada  += finalizarReporte();
        return horasJornada ;
    }

    /** Métodos simulación **/
    private int testearLogicaDelPrograma(){
        System.out.println("Verificando las definiciones y lógica");
        return 3;
    }

    private int encontrarBugs(){
        System.out.println("Bugs encontrados : 4");
        return 4;
    }

    private int proveerOptimizaciones(){
        System.out.println("Es posible realizar un if en lugar de una función para ahorrar memoria");
        return 1;
    }

    private int finalizarReporte(){
        System.out.println("Reporte finalizado");
        return  2;
    }
}
