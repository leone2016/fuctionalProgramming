package functionalprogramming;

/**
 *
 * @author Leo
 */
public class LambdaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        Clase 7
        //        FunctionTest ft = ( ) ->  System.out.println("Hola mundo");
        //        ft.saludar();
        //        
        //        LambdaTest obj = new LambdaTest();
        //        obj.miMetodo(ft);

        //        Clase 8 - parametros
        //        LambdaTest obj = new LambdaTest();
        //        Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
        //        // op.imprimeSuma(15, 17);
        //        obj.miMetodo2(op, 15, 15);
        //        obj.miMetodo2((num1, num2)-> System.out.println(num1 * num2), 2, 2);
        
        //        clase 9 - retorna parametros
        //        engine((x, y) -> x + y);
        //        engine((x, y) -> x - y);
        //        engine((x, y) -> x % y);
        //        engine((x, y) -> x * y);
        
//        clase 9 - ambiguedad
//        engine((CalculadoraLong)(x, y) -> x * y);

    }

    /**
     * clase 7
     *
     * prueba basica de lambdas
     *
     * @param parametro
     */
    public void miMetodo(FunctionTest parametro) {
        parametro.saludar();
    }

    /**
     * clase 8
     *
     *
     * @param op: Esto se conoce como una interfaz funcional por que solo tiene
     * un método abstracto miMetodo2(x,x) recibe 2 parametros
     * @param num1
     * @param num2
     */
    public void miMetodo2(Operaciones op, int num1, int num2) {
        op.imprimeSuma(num1, num2);
    }

    /**
     * clase 9
     * @param cal: esto se conoce como interface funcional, porque solo tiene 
     * un metodo abstracto que RETORNA un valor entero
     */
    private static void  engine(Calculadora cal) {
        int x = 2, y = 3;
        int resultado = cal.calcular(x, y);
        System.out.println(resultado);
    }
    /**
     * clase 10 - ambiguedad
     * @param cal: esto se conoce como interface funcional, porque solo tiene 
     * un metodo abstracto que RETORNA un valor entero
     */
    private static void  engine(CalculadoraLong cal) {
        long x = 2, y = 3;
        long resultado = cal.calcular(x, y);
        System.out.println(resultado);
    }

}
