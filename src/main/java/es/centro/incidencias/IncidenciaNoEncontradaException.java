
package es.centro.incidencias;

/**
 * Excepción que indica que no se ha encontrado una incidencia.
 *
 * @author Cristina Fernández Rodríguez
 * @version 1.0.0
 * @since 1.0.0
 */
public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Crea una excepción para el identificador de incidencia indicado.
     *
     * @param id identificador de la incidencia que no se ha encontrado
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
