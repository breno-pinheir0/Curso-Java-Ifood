import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // não mantém a ordem de inserção e não adiciona valores duplicados.
        System.out.println(notas.toString());
    }   
}
