/*
 * Faça um programa que leia conkuntos de dois valores
 * o primeiro representando o nome do aluno e o segundo representando sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */
import java.util.*;
public class Ex01_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = " ";
        int idade;
        

        while(nome.charAt(0) != '0'){
            System.out.println("Digite o nome: ");
            nome = scan.nextLine();

            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
            String lixo = scan.nextLine();
            System.out.println("O nome é: " + nome + ". A idade é: " + idade);
        }
        scan.close();



    }
}
