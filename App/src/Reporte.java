public class Reporte {
    
    // Ejercicio 2.1: Método sin retorno (void)
    public void generarEncabezado() {
        System.out.println("--- ENCABEZADO DEL REPORTE ---");
    }

    // Ejercicio 2.1: Método con retorno (String)
    public String obtenerCuerpo() {
        return "Este es el contenido principal del reporte.";
    }

    // Ejercicio 2.3: Método con argumentos variables (var-args)
    public void procesarSecciones(String... secciones) {
        System.out.println("Procesando " + secciones.length + " secciones:");
        // Recorriendo las secciones con un bucle for-each
        for (String seccion : secciones) {
            System.out.println("- " + seccion);
        }
    }
}