import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // não mantém a ordem de inserção e não adiciona valores duplicados.
        System.out.println(notas.toString()); // Transformando de Double para String

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        
        Iterator<Double> iterator = notas.iterator(); // usado para acessar elementos de uma coleção 
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        iterator = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            if(next < 7) iterator.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>(); //LinkedHashSet mantém a ordem dos elementos de acordo com a inserção
        notas.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); // TreeSet ordena de acordo com a ordem natural dos elementos. Só funciona porque a classe Double possui comparator
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    }
}
