import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(s-> System.out.println());


        /*System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s){ // pega cada elemento do stream e imprime
                System.out.println();
            }
        });*/
 
        System.out.println("Pegue os 5 primeiro números e coloque dentro de um Set");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println); // Set não aceita números repetidos, por isso o 1 só aparece 1 vez
    
        System.out.println("Transforme esta lsita de String em uma lista de números inteiros.");
        
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);;



    }
}
