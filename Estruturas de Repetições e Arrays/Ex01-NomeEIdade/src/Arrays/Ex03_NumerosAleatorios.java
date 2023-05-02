package Arrays;
import java.util.Random;
/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final, mostre os números e seus sucessores.
 */
public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] array = new int[20];

        System.out.println("Os números aleatórios são: ");
        for(int i = 0; i < 20; i++){
            int numero = aleatorio.nextInt(100);
            array[i] = numero;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Os sucessores dos números aleatórios são: ");
        for(int i = 0; i < 20; i++){
            System.out.print(array[i]+1 + " ");
        }
    }
    
}
