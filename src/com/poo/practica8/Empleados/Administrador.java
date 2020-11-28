package com.poo.practica8.Empleados;

public class Administrador extends Empleado{

    Nomina nomina = new Nomina();

    /** Método Constructor **/
    public Administrador(String nombre, int ID) {
        super(nombre, ID,0);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());
    }

    /** Sobrescritura de toString **/
    public String toString(){
        return "\nADMINISTRADOR: " + getNombre();
    }

    /** Método Trabajar **/
    public int trabajar(){
        int horasJornada = 0;
        System.out.println("\t << HORA DE TRABAJAR >> ");
        horasJornada  += revisarDesarrollo();
        horasJornada  += organizarJunta();
        horasJornada  += realizarCuentas();
        return horasJornada ;
    }
    /** Métodos simulación **/
    private int revisarDesarrollo(){
        System.out.println("Mmmmm... los avances van según el cronograma");
        return 3;
    }
    private int organizarJunta(){
        System.out.println("Señores, tenemos asuntos que discutir, nos reuniremos mañana despues de la hora de comer ");
        return 1;
    }
    private int realizarCuentas(){
        System.out.println("Durante esta semana hemos gastado estos insumos, hay que registrarlos...");
        return 2;
    }
    public int pagarNomina(Empleado trabajador){
        nomina.pagar(trabajador);
        return 1;
    }
}
