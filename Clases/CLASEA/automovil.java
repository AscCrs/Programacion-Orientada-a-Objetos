package Clases.CLASEA;

/**
 * * Atributos:
 * *String marca 
 * *String modelo
 * *String color    
 * *int anio
 * *float velocidad maxima
 * 
 * !Modelar la clase con sus atributos
 * private String marca;
 * private String modelo;
 * private String color;
 * private int anio;
 * private float velocidadMaxima;
 */

public class automovil {
    private String marca;   
    private String modelo;
    private String color;
    private int anio;
    private float velocidadMaxima;
    
    public String getMarca() {
        return marca;
    }
    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
