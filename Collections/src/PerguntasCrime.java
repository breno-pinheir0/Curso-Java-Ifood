/*
 * Utilizando listas, faça um programa que faça 5 perguntas para
 * uma pessoa sobre um crime. As perguntas são:
 * 1. "Telefonou para a vítima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vítima?"
 * 4. "Devia para a vítima?"
 * 5. "Já trabalhou com a vítima?"
 * Se a pessoa responder positivamente à 2 questões, ela deve ser 
 * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 
 * como "Assassina". Caso contrário, ela será classificada como "inocente".
 */
import java.util.*;

public class PerguntasCrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Character>Respostas = new ArrayList<Character>();
        char resp;
        int contador = 0;

        System.out.println("Você telefonou para a vítima? (S para sim e N para não): ");
        resp = scan.nextLine().charAt(0);
        Respostas.add(0, resp);

        System.out.println("Você esteve no local do crime? (S para sim e N para não): ");
        resp = scan.nextLine().charAt(0);
        Respostas.add(1, resp);

        System.out.println("Você mora perto da vítima? (S para sim e N para não): ");
        resp = scan.nextLine().charAt(0);
        Respostas.add(2, resp);

        System.out.println("Você devia para a vítima? (S para sim e N para não): ");
        resp = scan.nextLine().charAt(0);
        Respostas.add(3, resp);

        System.out.println("Você já trabalhou com a vítima? (S para sim e N para não): ");
        resp = scan.nextLine().charAt(0);
        Respostas.add(4, resp);

        for(int i = 0; i < Respostas.size(); i++){
            if(Respostas.get(i) == 'S'){
                contador++;
            }
        }

        if(contador < 2){
            System.out.println("Inocente.");
        }

        if(contador == 2){
            System.out.println("Suspeita.");
        }

        if(contador == 3 || contador == 4){
            System.out.println("Cúmplice.");
        }

        if(contador == 5){
            System.out.println("Assassina.");
        }
    
    
    
    
    
    
    
    
    
    
    
    
        scan.close();
    }
    
}
