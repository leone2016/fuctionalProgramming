package EjercicioFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author leoz3
 */
public class DatosComensales {

    public static void main(String[] args) {
        List<Comensal> listaComensales = Arrays.asList(
        new Comensal("Usuario1", 10,21),
        new Comensal("Usuario2", 10,20), 
        new Comensal("Usuario3", 10,12),
        new Comensal("Usuario4", 10,21),
        new Comensal("Usuario5", 10,23),
        new Comensal("Usuario6", 10,32)
        );
        
        List<Object> nombresComensales = getDatosComensales(listaComensales, x-> x.getNombre());
        nombresComensales.forEach(comensal -> System.out.println("El nombre del comensal es "+comensal));
    }
    
    /**
     * 
     * 
     * @param listCom: de tipo Comensal
     * @param func: una Function, que recibe Comensales y transforma a Objeto
     * @return una lista de objetos
     */
    public static List<Object> getDatosComensales(
            List<Comensal> listCom, Function<Comensal, Object> func) {

        //Esta lista guardará datos personalizados de comensales
        List<Object> listaDatos = new ArrayList<>();
        
        //Itera a traves de la lista de comensales que recibimos
        for (Comensal comensal : listCom) {
            listaDatos.add(func.apply(comensal));
        }
        return listaDatos;
    }

}
