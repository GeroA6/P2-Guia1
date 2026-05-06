public class CuentaBancaria {
    
    // Ejercicio 1.3: Encapsulación mediante el modificador de acceso 'private'
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo inicial predeterminado
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) { // Validación para proteger la integridad de los datos
            saldo += monto;
        } else {
            System.out.println("Error: No se pueden depositar montos negativos o nulos.");
        }
    }
}