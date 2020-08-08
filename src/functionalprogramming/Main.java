/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalprogramming;

/**
 *
 * @author leoz3
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println(create().calcular(18, 6));
        
    }
    
    /**
     * Clase 11: las expresiones lambdas representan funciones, a fin de cuentas
     * son objetos de tipos de una interfaz funcional
     * @return 
     */
    private static CalculadoraLong create(){
         
        return ( x, y ) -> x/y;
    }
    
}
