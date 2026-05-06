public class App {
    public static void main(String[] args) throws Exception {
        // --- Ejercicio 2.1: Métodos con y sin retorno ---
        System.out.println("--- Pruebas Ejercicio 2.1 ---");
        Reporte reporte = new Reporte();
        reporte.generarEncabezado(); // Método void
        String cuerpo = reporte.obtenerCuerpo(); // Método con retorno
        System.out.println(cuerpo);
        System.out.println("----------------------------------------");

        // --- Ejercicio 2.2: Sobrecarga de constructores y métodos ---
        System.out.println("--- Pruebas Ejercicio 2.2 ---");
        Usuario usuario2 = new Usuario("Ana"); // Constructor con nombre
        usuario2.actualizarPerfil("ana@ejemplo.com"); // Sobrecarga de método 1
        Usuario usuario3 = new Usuario("Carlos", 30); // Constructor con nombre y edad
        usuario3.actualizarPerfil("carlos@ejemplo.com", 123456789); // Sobrecarga de método 2
        System.out.println("----------------------------------------");

        // --- Ejercicio 2.3: Argumentos Variables (var-args) ---
        System.out.println("--- Pruebas Ejercicio 2.3 ---");
        reporte.procesarSecciones("Introducción", "Desarrollo", "Conclusión");
        reporte.procesarSecciones(); // Llamada sin argumentos para comprobar su flexibilidad
        System.out.println("----------------------------------------");

        // --- Ejercicio 3.2: Polimorfismo de Herencia ---
        System.out.println("--- Pruebas Ejercicio 3.2 ---");
        Documento doc1 = new Factura();
        Documento doc2 = new Recibo();
        
        // En tiempo de ejecución Java decide qué versión ejecutar basándose en el tipo del objeto (y no de la referencia)
        doc1.procesar(); // Imprime: "Procesando la Factura..."
        doc2.procesar(); // Imprime: "Procesando el Recibo..."
        System.out.println("----------------------------------------");
        
        // --- Ejercicio 4.2: Polimorfismo a través de Interfaces ---
        System.out.println("--- Pruebas Ejercicio 4.2 ---");
        Factura miFactura = new Factura();
        enviarAImpresion(miFactura);
    }

    // Ejercicio 4.2: Método independiente orientado a una interfaz
    public static void enviarAImpresion(Exportable documentoExportable) {
        System.out.println("Preparando documento para impresión...");
        // El método confía en que cualquier objeto que llegue aquí sabe cómo exportarse
        documentoExportable.exportar();
    }
}
