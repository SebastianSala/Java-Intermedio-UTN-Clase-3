package javaintermedio.appclase3.utilities;

import java.util.List;
import java.util.stream.Collectors;

public class Transformador {

  public List<String> aMayusculas(List<String> enMinusculas) {
    List<String> listaTransformada = enMinusculas.stream().map(x -> x.toUpperCase()).toList();
    return listaTransformada;
  }

  public String aConcatenar(List<String> text, int length) {
    String concatenado = text.stream().filter(word -> word.length() > length).collect(Collectors.joining(", "));
    return concatenado;
  }
  
}
