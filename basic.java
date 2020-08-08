
public interface Ficticia {
    public void aceptar(int valor);
}

    /**
     * Implementación de Interface en POO
     */
    Ficticia f = new Ficticia() {
        @java.lang.Override
        public void aceptar() {
            System.out.println("Hola mundo");
            // cuerpo del método implementado aceptar
        }

    }

    /**
     * en la expresion lambda no es necesario identificar el tipo de valor
     */
    Ficticia f = (valor) -> System.out.printf("Hola mundo"+valor);
    Ficticia f = (valor, valor2) -> valor / valor2;