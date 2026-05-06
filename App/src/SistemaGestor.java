/**
 * Clase SistemaGestor
 * Su propósito es administrar la configuración general del sistema,
 * sirviendo como ejemplo de uso de distintos tipos de comentarios y modificadores.
 */
public class SistemaGestor {

    // Ejercicio 1.2: Campo constante. 
    public static final int MAX_CONEXIONES = 10;

    /*
     * Bloque de configuración principal:
     * Aquí se inicializan parámetros clave del entorno,
     * demostrando el uso de un comentario de múltiples líneas.
     */
    public void mostrarConfiguracion() {
        // Variable local temporal para almacenar el mensaje
        String mensaje = "Límite de conexiones: " + MAX_CONEXIONES;
        System.out.println(mensaje);
        
        // ¿Por qué pertenece a la clase y no se reasigna?
        // Al usar 'static', el campo pertenece a la clase en sí y se comparte en todas las instancias.
        // Al usar 'final', se define como una constante; su valor no puede cambiar ni ser reasignado posteriormente.
    }
}