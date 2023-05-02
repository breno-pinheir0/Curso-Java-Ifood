import java.util.*;
/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */

public class Ex04_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0, quantidade = 0, contador = 0, par = 0, impar = 0;

        System.out.println("Digite quantos números serão lidos: ");
        quantidade = scan.nextInt();
        while(contador < quantidade){
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            contador++;
            if(numero%2 == 0){
                par++;
            } else{impar++;}
        }
        scan.close();
        System.out.println("Foram digitados " + par + " números pares e " + impar + " números ímpares.");
    }

    
}
