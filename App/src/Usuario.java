public class Usuario {
    private String nombre;
    private int edad;

    // Ejercicio 2.2: Sobrecarga de constructores
    public Usuario() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Ejercicio 2.2: Sobrecarga de métodos
    public void actualizarPerfil(String correo) {
        System.out.println("Perfil actualizado con el correo: " + correo);
    }

    public void actualizarPerfil(String correo, int telefono) {
        System.out.println("Perfil actualizado con correo: " + correo + " y teléfono: " + telefono);
    }
}