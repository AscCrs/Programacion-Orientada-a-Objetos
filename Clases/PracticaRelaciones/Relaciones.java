import java.util.Scanner;

public class Relaciones {
  ArraylList<Object> personas;
  Persona p;

  Relaciones() {
    personas = new ArrayList<Object>();
  }

  public void agregarPersona(String nombre, int num) {
    p = new Persona(nombre);
    for (i = 0; i < num; i ++) {
      agregarAmigo();
    }
    personas.add(p);
  }

  public void agregarAmigo(String amigo) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Agregar amigos: ");
    p.setAmigo(sc.next());
  }

  public void imprimir() {
    for(int i = 0; i < personas.size(); i++) {
      System.out.println(personas.get(i.imprimir));
    }
  }
}
