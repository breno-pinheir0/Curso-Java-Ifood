import java.util.*;
/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5! = 120
 */

public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0, fatorial = 1;
        System.out.println("Digite um número: ");
        numero = scan.nextInt();
        for(int i = numero ; i > 0; i--){
            fatorial = fatorial * i;
        }
        scan.close();
        System.out.println("O fatorial do número " + numero + " é " + fatorial);
    }
    
}
