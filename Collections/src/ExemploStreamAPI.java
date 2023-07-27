import java.util.*;
import java.util.function.*;
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

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
       List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>(){
            @Override
            public boolean test(Integer i){
                if(i %2 == 0 && i > 2) return true;
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);




    }
}
