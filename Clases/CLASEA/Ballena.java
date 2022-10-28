package Clases.CLASEA;

public class Ballena {
    private String especie;
    private float pesoEspecimen;
    private float longitud;
    
    public float getLongitud() {
        return longitud;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public float getPesoEspecimen() {
        return pesoEspecimen;
    }
    public void setPesoEspecimen(float pesoEspecimen) {
        this.pesoEspecimen = pesoEspecimen;
    }
    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
}
