/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author leoz3
 */
public class TestPredicate1 {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (valor) -> valor > 0;
        System.out.println(predicate.test(123));

        List<Empleado> empleados = Arrays.asList(
                new Empleado("Leonardo", 28, 655, "DEV"),
                new Empleado("Alicia", 35, 500, "ventas"),
                new Empleado("Manolo", 40, 800, "Operaciones"),
                new Empleado("nando", 50, 500, "Ventas"),
                new Empleado("Cinthia", 25, 500, "Ventas"),
                new Empleado("Arturo", 45, 700, "TeleMarketing"),
                new Empleado("esteban", 19, 700, "Bodega"),
                new Empleado("Dámaris", 36, 1500, "Cobranza"),
                new Empleado("Lina", 32, 1200, "DEV")
        );
        Evaluador evaluador = new Evaluador();
        List<Empleado> empSalarioAltos = evaluador.evaluar(empleados, empl -> empl.getSalario() > 700);
        System.out.println("Empleados con salario mayor a 700");
        for (Empleado empSalarioAlto : empSalarioAltos) {
            System.out.println(empSalarioAlto.getNombre());
        }
        System.out.println("\nEmpleados que inician con L");

        List<Empleado> empBusqueda = evaluador.evaluar(empleados, empl -> empl.getNombre().toUpperCase().contains("L"));

        for (Empleado empleado : empBusqueda) {
            System.out.println(empleado.getNombre());
        }
        // clase 18 - negate()
        System.out.println("\nEmpleados  jovenes ( < 25 ) incrementar en 10% el salario");
        List<Empleado> empJovenes = evaluador.evaluar(empleados, empl -> empl.getEdad() <= 25);
        Funciones func = new Funciones();
        for (Empleado empJovene : empJovenes) {
            double nuevoSalario = func.incrementoSalario(
                    empJovene,
                    10,
                    (salario, incremento) -> salario + (salario * incremento / 100));
            empJovene.setSalario(nuevoSalario); 
            System.out.println("Nuevo salario " + empJovene.toString());
        }

    }

}
   