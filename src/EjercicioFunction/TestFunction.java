/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioFunction;

import java.util.function.Function;

/**
 *
 * @author leoz3
 */
public class TestFunction {

    public static void main(String[] args) {
        // forma tradicional 
        Function<Integer, String> convertidor0
                = new Function<Integer, String>() {
            @Override
            public String apply(Integer t) {
                return Integer.toString(t);
            }
        };

         // forma interfaces funcionales
         // apply transforma de entero a string 
        Function<Integer, String> convertidor = x -> Integer.toString(x);
        System.out.println(convertidor0.apply(3));
        System.out.println(convertidor.apply(3));
        System.out.println(convertidor.apply(300).length());
    }
}
