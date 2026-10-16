
package es.centro.incidencias;

import java.util.List;

/**
 * Gestiona la lista de incidencias de soporte del centro educativo.
 * Permite listar las incidencias, filtrar las abiertas y realizar búsquedas.
 *
 * @author Cristina Fernández Rodríguez
 * @version 1.0.0
 * @since 1.0.0
 */
public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Crea el gestor con una lista inicial de incidencias de ejemplo.
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Obtiene todas las incidencias.
     *
     * @return lista con todas las incidencias
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Obtiene las incidencias que están abiertas.
     *
     * @return lista de incidencias abiertas
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Busca incidencias cuyo identificador o título contenga el texto indicado.
     *
     * @param texto texto que se desea buscar
     * @return lista de incidencias que coinciden con el texto
     * @see Incidencia#coincideCon(String)
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca una incidencia por su identificador.
     *
     * @param id identificador de la incidencia que se desea buscar
     * @return incidencia encontrada
     * @throws IncidenciaNoEncontradaException si no existe una incidencia con ese identificador
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Obtiene una incidencia por su identificador.
     *
     * @param id identificador de la incidencia que se desea buscar
     * @return incidencia encontrada, o {@code null} si no existe
     * @deprecated Se recomienda utilizar {@link #buscarPorId(String)}, que
     *             comunica la ausencia de la incidencia mediante una excepción
     *             en lugar de devolver {@code null}.
     * @since 1.0.0
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
