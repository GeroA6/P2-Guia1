// Ejercicio 3.1 y 4.1: Hereda de clase abstracta y usa implementación de múltiples interfaces separadas por comas.
public class Factura extends Documento implements Exportable, Auditable {
    
    // Ejercicio 3.2: Sobrescritura de método
    @Override
    public void procesar() {
        System.out.println("Procesando la Factura...");
    }

    // Ejercicio 3.3: Sobrecarga del método heredado agregando una lista de parámetros distinta
    public void procesar(boolean esUrgente) {
        System.out.println("Procesando la Factura. ¿Es urgente? " + esUrgente);
    }

    // Ejercicio 4.1: Implementación del método de Exportable
    @Override
    public void exportar() {
        System.out.println("Exportando Factura a PDF...");
    }

    // Ejercicio 4.1: Implementación del método de Auditable
    @Override
    public void registrarAuditoria() {
        System.out.println("Registrando auditoría de la Factura...");
    }
}