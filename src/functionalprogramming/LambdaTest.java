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

        LambdaTest obj = new LambdaTest();
        Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
        // op.imprimeSuma(15, 17);
         obj.miMetodo2(op, 15, 17 );
    }

    
    public void miMetodo(FunctionTest parametro) {
        parametro.saludar();
    }
    public void miMetodo2(Operaciones op, int num1, int num2) {
        op.imprimeSuma(num1, num2);
    }

}
