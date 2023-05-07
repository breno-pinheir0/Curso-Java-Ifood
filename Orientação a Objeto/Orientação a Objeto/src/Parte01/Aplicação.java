package Parte01;

import java.util.Scanner;

public class Aplicação {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro1 = new Carro();
        System.out.println("Digite o valor da gasolina: ");
        double valorGasolina = scan.nextDouble();
        System.out.println("O tanque está cheio? [S para sim e N para não] ");
        char resposta = scan.next().charAt(0);
        if(resposta == 'S' || resposta == 's'){
            double valorAPagar = carro1.encherTanque(valorGasolina);
            System.out.println("Valor a pagar: R$" + valorAPagar);
        }
        if(resposta == 'N' || resposta == 'n'){
            System.out.println("Digite quantos litros faltam para encher o tanque: " );
            carro1.tanqueGasolina = scan.nextInt();
            double valorAPagar = carro1.encherTanque(valorGasolina, carro1.tanqueGasolina);
            System.out.println("Valor a pagar: R$" + valorAPagar);

        }
        System.out.println("A cor do carro modelo '" + carro1.modelo + "' é " + carro1.cor + ".");
        scan.close();
    }
}
