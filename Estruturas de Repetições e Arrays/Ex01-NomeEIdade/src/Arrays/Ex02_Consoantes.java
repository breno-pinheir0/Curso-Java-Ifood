package Arrays;
import java.util.Scanner;
/*
 * Faça um programa que leia um vetor de 6 caracteres
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes
 */
public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] array = new char[6];
        int consoantes = 0;
        for(int i = 0; i < array.length; i++){
            System.out.println("Digite uma letra(minúscula): ");
            array[i] = scan.nextLine().charAt(0);
            if(array[i] >= 'a' && array[i] <= 'z'){    
                if(array[i] != 'a' && array[i] != 'e' && array[i] != 'i' && array[i] != 'o' && array[i] != 'u'){
                    consoantes++;
                }
            }
        }
        System.out.println("Existem " + consoantes + " consoantes. São elas: ");
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 'a' && array[i] <= 'z'){    
                if(array[i] != 'a' && array[i] != 'e' && array[i] != 'i' && array[i] != 'o' && array[i] != 'u'){
                    System.out.print(array[i]);
                }
            }
        }
        scan.close();
    }
}
