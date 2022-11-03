import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Relaciones persona = new Relaciones();
    //boolean val = true;

    persona.agregarPersona("Christian");
    persona.agregarPersona("Cristopher");
    //do {
      //System.out.println();
    //} while (val == true);

    sc.close();
  }
}
