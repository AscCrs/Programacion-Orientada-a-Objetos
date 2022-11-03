public class Persona {
  String nombre;
  ArrayList<Persona> amigos;

  Persona(String nombre) {
    this.nombre = nombre;
    amigos = new ArrayList<Persona>();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setAmigo(Persona amigo) {
    amigos.add(amigo);
  }

  public void imprimir() {
    System.out.println(nombre);
    for (int i = 0; i < amigos.size(); i++) {
      System.out.println(amigos.get(i));
    }
  }
}
