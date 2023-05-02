package Arrays;
import java.util.Random;
public class Ex04_ArrayMultidimensional {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] M = new int[4][4];

        System.out.println("Os números aleatórios são: ");
        for(int i = 0; i < 4; i++){
            
            for(int j = 0; j < 4; j++){
                int numero = aleatorio.nextInt(10);
                M[i][j] = numero;
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
            
            
        }
    }
}
