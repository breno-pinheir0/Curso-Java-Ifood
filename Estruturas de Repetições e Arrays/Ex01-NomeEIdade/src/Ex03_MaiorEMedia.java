import java.util.Scanner;
/*
 * Faça um programa que leia 5 números, 
 * informe o maior número
 * e a média desses números.
 */


public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int contador = 0, numero = 0,media = 0, maior = 0;
        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            media = media + numero;
            if(numero > maior){
                maior = numero;
            }
            contador++;

        }while(contador < 5);
        media = media / 5;
        System.out.println("Maior número: " + maior + ". Média: " + media);

    }
}
