
package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa una incidencia de soporte del centro educativo.
 * Almacena su identificador, título, prioridad y estado.
 *
 * @author Cristina Fernández Rodríguez
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Crea una incidencia con los datos indicados.
     *
     * @param id identificador de la incidencia
     * @param titulo título o descripción breve de la incidencia
     * @param prioridad nivel de prioridad de la incidencia
     * @param abierta indica si la incidencia está abierta
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Obtiene el identificador de la incidencia.
     *
     * @return identificador de la incidencia
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el título de la incidencia.
     *
     * @return título de la incidencia
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la prioridad de la incidencia.
     *
     * @return prioridad de la incidencia
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Comprueba si la incidencia está abierta.
     *
     * @return {@code true} si está abierta; {@code false} en caso contrario
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si el identificador o el título contienen el texto indicado.
     * La comparación no distingue entre mayúsculas y minúsculas.
     *
     * @param texto texto que se desea buscar
     * @return {@code true} si coincide con el identificador o el título;
     *         {@code false} en caso contrario
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
