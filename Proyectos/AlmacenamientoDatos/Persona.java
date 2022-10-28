public class Persona {
    private String nombre;
    private float altura;
    private int edad;

    public Persona(String nombre, float altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public float getAltura() { return altura; }
    public int getEdad() { return edad; }
}
