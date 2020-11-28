package com.poo.practica8;

import com.poo.practica8.Empleados.*;

public class Prueba {
    public static void main(String[] args) {
        Disenador disenador = new Disenador("Alfredo Ramirez Torres", 1234);
        System.out.println("Horas de trabajo: " + disenador.getHorasDeTrabajo());

        Desarrollador desarrollador = new Desarrollador("Mark Zuckerberg", 1405);
        System.out.println("Horas de trabajo: " + desarrollador.getHorasDeTrabajo());

        TesterDesarrollador testerDesarrollador = new TesterDesarrollador("Elon Musk", 2806);
        System.out.println("Horas de trabajo: " + testerDesarrollador.getHorasDeTrabajo());

        TesterUsuario testerUsuario = new TesterUsuario("Amelia Earhart", 2406);
        System.out.println("Horas de trabajo: " + testerUsuario.getHorasDeTrabajo());

        LiderProyecto liderProyecto = new LiderProyecto("Andrea Garcia Garcia", 48267);
        System.out.println("Veamos como va la producción...");
        liderProyecto.revisarTrabajadores(disenador);
        liderProyecto.revisarTrabajadores(desarrollador);
        liderProyecto.revisarTrabajadores(testerDesarrollador);
        liderProyecto.revisarTrabajadores(testerUsuario);
        System.out.println("Horas de trabajo: " + liderProyecto.getHorasDeTrabajo());

        Administrador admin = new Administrador("Fernando Ramirez Pinales", 3421);
        System.out.println("Horas de trabajo: " + admin.getHorasDeTrabajo());
        System.out.println("\nEs hora de pagar a los empleados...");
        admin.pagarNomina(disenador);
        admin.pagarNomina(desarrollador);
        admin.pagarNomina(testerDesarrollador);
        admin.pagarNomina(testerUsuario);
        admin.pagarNomina(liderProyecto);
        admin.pagarNomina(admin);

        System.out.println("Salarios de la semana: \nDisenador: " + disenador.getSalario() + "\nDesarrollador:" +
                desarrollador.getSalario() + "\nTester Desarrollador:" + testerDesarrollador.getSalario() + "\nTester Usuario:"
                + testerUsuario.getSalario() + "\nLider del proyecto: " + liderProyecto.getSalario()
                + "\nAdministrador: " + admin.getSalario());
    }
}