package Clases.CLASEA;

/**
 *  Atributos de la clase estudiantes:
 *  Estatura, Edad, Nombre, Lugar de Procedencia, Promedio, 
 */

public class Estudiante {
    private int NumeroControl;
    private float Promedio;
    private String Nombre;

    
    public String getNombre() {
        return Nombre;
    }
    public int getNumeroControl() {
        return NumeroControl;
    }
    public void setNumeroControl(int numeroControl) {
        this.NumeroControl = numeroControl;
    }
    public float getPromedio() {
        return Promedio;
    }
    public void setPromedio(float promedio) {
        this.Promedio = promedio;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
}
