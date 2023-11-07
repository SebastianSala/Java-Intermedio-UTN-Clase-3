package javaintermedio.appclase3.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javaintermedio.appclase3.utilities.Transformador;

public class App {

  public void run() {
    
    String[] words = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
    List<String> text = Arrays.asList(words);

    Transformador transformador = new Transformador();

    System.out.println("Ejercicio 1: ------------------------ ");
    System.out.println();

    this.ejercicio1(transformador, text);

    System.out.println();
    System.out.println("Fin ejercicio 1: ------------------------ ");
    
    System.out.println("-------------------------------------");

    System.out.println("Ejercicio 2: ------------------------ ");
    System.out.println();

    this.ejercicio2(transformador, text);

    System.out.println();
    System.out.println("Fin ejercicio 2: ------------------------ ");

  }

  public void ejercicio1(Transformador transformador, List<String> text) {

    System.out.println("Antes de transformador:" + text.get(1));
    List<String> textTransformed = transformador.aMayusculas(text);

    System.out.println("Después de transformador:" + textTransformed.get(1));

  }

  public void ejercicio2(Transformador transformador, List<String> text) {

    int wordLength = 3;

    System.out.println("Antes de transformador:" + text.get(1));
    String textTransformed = transformador.aConcatenar(text, wordLength);

    System.out.println("Después de transformador:" + textTransformed);

  }

}
