package EjercicioBiFuction;

import java.util.function.BiFunction;

/**
 *
 * @author leoz3
 */
public class EjercicioBiFuction {

    public static void main(String[] args) {
        BiFunction<String, String, String> bi = (x, y) -> x + y;
        System.out.println(bi.apply("Hola", "Mundo"));
        
        String resultado = calc(( x , y )-> ":"+( x * y ),60, 10);
        System.out.println("El resultado es"+ resultado + " - "+ resultado.getClass());
    }
    
     
    public static String calc(BiFunction<Integer, Integer, String> bi, Integer i1,Integer i2 ){
        return bi.apply(i1  , i2);
    }

}
