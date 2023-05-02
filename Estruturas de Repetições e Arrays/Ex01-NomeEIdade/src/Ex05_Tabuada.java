import java.util.*;
/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada
 * 
 */

public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero_desejado = 0, numero_tabuada = 1, multiplicacao = 0;
        System.out.println("Digite o número que deseja sabebr a tabuada: ");
        numero_desejado = scan.nextInt();
        System.out.println("Tabuada de " + numero_desejado + ":");

        while(numero_tabuada <= 10){
            multiplicacao = numero_desejado * numero_tabuada;
            System.out.println(numero_desejado + " X " + numero_tabuada + " = " + multiplicacao);
            numero_tabuada++;
        }
    }
}
