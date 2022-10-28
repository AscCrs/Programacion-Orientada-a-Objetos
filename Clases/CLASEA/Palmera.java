package Clases.CLASEA;

/**
 *  Problema. Implementar la clase Palmera con 4 atributos 
 *  en el lenguaje java
 * 
 *  1.- Observar todas las palmeras que yo conozca 
 *  La palmera del parque cerca de mi casa
 *  La palmera de mi jardin
 *  La palmera de la playa
 *  La palmera de la calle de mi casa
 * 
 *  Todas esas palmeras son objetos de la clase palmera
 * 
 *  2.- ¿Cuáles son los atributos que tiene en común esos objetos palmera?
 *  Altura, número de cocos, tamaño de las palmas, color, diametro
 * 
 *  3.- Describir la clase palmera
 * 
 *  Clase: Palmera
 *  Atributos: 
 *              altura
 *              numeroCocos
 *              tamañoPalmas
 *              color
 *              diametro
 *              edad
 * 
 *  4.- Implementar los atributos de la clase Palmera en java.
 *  
 *  altura -------- private float altura;
 *  numeroCocos ----- private short numeroCocos;
 *  tamañoPalmas ----- private String tamañoPalmas; #String es una clase
 *  color ------------ private String color;
 *  diametro --------- private float diametro;
 *  edad ------------- private int edad;
 *    
 */

 // Clase es una plantilla que describe los atributos y métodos
//  que tienen en común un conjunto de objetos  

public class Palmera {
    private float altura;
    private short num_cocos;
    private String tamañoPalmas;
    private String color;
    private float diametro;
    private int edad;
    
    public int getEdad() {
        return edad;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public short getNum_cocos() {
        return num_cocos;
    }
    public void setNum_cocos(short num_cocos) {
        this.num_cocos = num_cocos;
    }
    public String getTamañoPalmas() {
        return tamañoPalmas;
    }
    public void setTamañoPalmas(String tamañoPalmas) {
        this.tamañoPalmas = tamañoPalmas;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getDiametro() {
        return diametro;
    }
    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

// Actividad.- Implementar la clase Ballena, Escuela y Estudiante.
// Con 3 atributos casa clase. Un archivo por clase