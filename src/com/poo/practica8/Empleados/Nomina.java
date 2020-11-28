package com.poo.practica8.Empleados;

public class Nomina {
    /**Salarios por hora para cada puesto en MXN */
    int salarioAdmin = 680;
    int salarioDesarrollador = 700;
    int salarioDisenador = 750;
    int salarioLider = 860;
    int salarioTester = 760;

    /** Funcion pagar */
    public void pagar(Empleado desconocido) {
        /** Se obtienen las horas trabajadas con el getter */
        int horasTrabajadas = desconocido.getHorasDeTrabajo();

        /** Se utilizan estructuras if, else if para poder evaluar la instancia obtenida y pagar
         *  las horas trabajadas según el tipo de empleado */

        /** Uso de instanceof para obtener los datos del tipo de trabajador */
        if (desconocido instanceof Administrador)
            desconocido.setSalario(salarioAdmin * horasTrabajadas);
        else if (desconocido instanceof Desarrollador)
            desconocido.setSalario(salarioDesarrollador * horasTrabajadas);
        else if (desconocido instanceof Disenador)
            desconocido.setSalario(salarioDisenador * horasTrabajadas);
        else if (desconocido instanceof LiderProyecto)
            desconocido.setSalario(salarioLider * horasTrabajadas);
        else if (desconocido instanceof Tester)
            desconocido.setSalario(salarioTester * horasTrabajadas);

        /** Las horas de trabajo del empleado vuelven a 0 */
        desconocido.setHorasDeTrabajo(0);
    }
}
