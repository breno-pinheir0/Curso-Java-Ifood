package Arrays;
import java.util.*;
/*
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa
 * 
 */

public class Ex01_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];
        
        for(int i = 0; i < 6; i++){
            System.out.println("Digite um número: ");
            array[i] = scan.nextInt();
        }
        System.out.println("Array: ");
        for(int i = array.length - 1; i >= 0; i--){
            
            System.out.print(array[i]); 
        }
        scan.close();
    }
}
