import java.util.*;
/*
 * Faça um programa que peça uma nota, entre zero e dez
 * Mostre uma mensagem caso o valor seja inválido
 *  e continue pedindo até que o usuário informe um valor válido.
 * 
 */

public class Ex02_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Digite um número: ");
        nota = scan.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Número inválido!");
            System.out.println("Digite novamente: ");
            nota = scan.nextInt();
        }
            

    }
}
