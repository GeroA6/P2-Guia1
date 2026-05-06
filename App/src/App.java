public class App {
    public static void main(String[] args) throws Exception {
        // --- Ejercicio 2.3: Argumentos Variables (var-args) ---
        Reporte reporte = new Reporte();
        reporte.procesarSecciones("Introducción", "Desarrollo", "Conclusión");
        reporte.procesarSecciones(); // Llamada sin argumentos para comprobar su flexibilidad
        System.out.println("----------------------------------------");

        // --- Ejercicio 3.2: Polimorfismo de Herencia ---
        Documento doc1 = new Factura();
        Documento doc2 = new Recibo();
        
        // En tiempo de ejecución Java decide qué versión ejecutar basándose en el tipo del objeto (y no de la referencia)
        doc1.procesar(); // Imprime: "Procesando la Factura..."
        doc2.procesar(); // Imprime: "Procesando el Recibo..."
        System.out.println("----------------------------------------");
        
        // --- Ejercicio 4.2: Polimorfismo a través de Interfaces ---
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
