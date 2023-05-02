/*
 * Crie uma aplicação que resolva as seguintes situações:
 * o Calcule as 4 operações básicas: soma, subtração, multiplicação 
 * e divisão. Sempre 2 valores devem ser passados
 
 * o A partir da hora do dia, informe a mensagem adequada: Bom dia, boa tarde e boa noite.  
 
 * o Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. 
 * Defina arbitrariamente as faixas que influenciam nos valores.
 * 
 */
import java.util.Scanner;
public class Ex01 {

    public static void calcular(double num1, double num2){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite S para soma, U para subtração, M para multiplicação e D para divisão: ");
        char opcao = scan.nextLine().charAt(0);

        if(opcao == 'S'){
            double soma = num1 + num2;
            System.out.println("Valor da soma: " + soma);
        }
        if(opcao == 'U'){
            double subtracao = num1 - num2;
            System.out.println("Valor da subtração: " + subtracao);
        }
        if(opcao == 'M'){
            double multiplicacao = num1 * num2;
            System.out.println("Valor da multiplicação: " + multiplicacao);
        }
        if(opcao == 'D'){
            double divisao = num1 / num2;
            System.out.println("Valor da divisão: " + divisao);
        }
        scan.close();
    }

    public static void mensagem(int hora){

        if(hora > 5 && hora < 12){
            System.out.println("Bom dia!");
        }
        if(hora >= 12 && hora < 18){
            System.out.println("Boa tarde!");
        }
        if(hora >= 18 || hora <= 5){
            System.out.println("Boa noite!");
        }
        
    }

    public static void emprestimo(double valor){
        Scanner scan = new Scanner(System.in);
        double taxa = valor * 0.35;
        double juros = 0;
        System.out.println("Digite quantos meses deseja pegar o empréstimo: ");
        int meses = scan.nextInt();
        for(int i = 0; i < meses; i++){
           juros = juros + valor * 0.08;
        }
        scan.close();
        valor = taxa + juros;
        System.out.println("Valor total a ser pago: R$" + valor);
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha qual opção deseja:");
        System.out.println("1 - Soma, Subtração, Divisão e Multiplicação");
        System.out.println("2 - Mensagem");
        System.out.println("3 - Empréstimo");
        int opcao = scan.nextInt();
        if(opcao == 1){
            System.out.println("Digite um número: ");
            double num1 = scan.nextDouble();
            System.out.println("Digite outro número: ");
            double num2 = scan.nextDouble();
            calcular(num1, num2);
        }

        if(opcao == 2){
            System.out.println("Digite a hora: ");
            int hora = scan.nextInt();
            mensagem(hora);
        }

        if(opcao == 3){
            System.out.println("Digite o valor a ser emprestado: ");
            double valor = scan.nextDouble();
            emprestimo(valor);
        }

        if(opcao != 1 && opcao != 2 && opcao != 3 ){
            System.out.println("Opção Inválida!");
        }
        scan.close();
    }
}
