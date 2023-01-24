import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HolaStream {
    public static void main(String[] args) {
      //Estoy con Java8, y esto se añadio en Java9!
      //List<String> listColors = List.of("red", "green", "blue");
      List<String> listColors = new ArrayList<>();
      listColors.add("Greeen");
      listColors.add("Blue");
      listColors.add("Red");
      listColors.add("Pink");

      
      Stream<String> stream = listColors.stream();
      //operaciones puedes apilarse como en js!
      Stream<String> limit = stream.limit(2).skip(1);

      List<String> listLimit = limit.collect(Collectors.toList());
      System.out.println("Stream pasado a Lista:" + listLimit);
      //Con ForEach (desde interfaz "Iterable" implementada por List)
      //listColors.forEach(color -> System.out.println(color));

      //prueba de chained tal...
      System.out.print("Stream a Lista Encadenando todo: ");
      List<String> otraLista = listColors.stream()
                                    .limit(3)
                                    .collect(Collectors.toList());
      System.out.println(otraLista);

    }
  
}
