package com.poo.practica8.Empleados;

public class LiderProyecto extends Empleado{
    Empleado empleado;

    /** Método Constructor **/
    public LiderProyecto(String nombre, int ID){
        super(nombre,ID,0);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());
    }

    /** Sobrescritura de toString **/
    public String toString(){
        return "\nLIDER DEL PROYECTO: " + getNombre();
    }

    /** Método Trabajar Sobreescritura adaptada a la subclase Lider de Proyecto**/
    public int trabajar(){
        System.out.println("\t << HORA DE TRABAJAR >> ");
        int horasLaborales = 0;
        horasLaborales += revisarStatusEmpresa();
        horasLaborales += pensarEnNuevoPrograma();
        return horasLaborales;
    }

    /** Métodos simulación **/
    public int revisarStatusEmpresa(){
        System.out.println("La empresa ha generado 500,000$ durante el último mes...");
        return 3;
    }

    public int pensarEnNuevoPrograma(){
        System.out.println("Necesitamos mas ideas para un nuevo programa, algo que sea innovador. Es hora de un nuevo juego, a trabajar.");
        return 2;
    }

    public int revisarTrabajadores(Empleado empleado){
        if (empleado.getHorasDeTrabajo() > 0){
            System.out.println("\tExcelente trabajo " + empleado.getNombre() + ", continue asi.");
        }
        else{
            System.out.println("El dinero no se genera solo " + empleado.getNombre() + ", pongase a trabajar");
        }
        return 1;
    }
}
