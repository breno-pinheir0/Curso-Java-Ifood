import java.util.*;
public class ExemploList {
    public static void main(String[] args) throws Exception {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        /* Formas de se declarar uma Lista:
        * ArrayList<Double> notas = new ArrayList<>;
        * List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 8d, 3.6));
        */
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0); //se colocar só 7, se entende que é um inteiro
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0); 
        notas.add(0.0);
        notas.add(3.6);
        /* Formas de imprimir uma lista:
         * System.out.println(notas);
         * System.out.println(notas.toString());
         */
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

    }
}
