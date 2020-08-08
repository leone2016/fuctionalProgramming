/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author leoz3
 */
public class Evaluador {
     public List<Empleado> evaluar(List<Empleado> listEmp,Predicate<Empleado> eval ){
         List<Empleado> listaNueva = new ArrayList<>();
          listEmp.forEach(empleado ->{
             if( eval.test(empleado)){
                 listaNueva.add(empleado);
             }
         });
          return listaNueva;
     }
}
