/*
 * Faça um programa que receba a temperatura média dos 6 primeiros meses
 * do ano e armazene-as em uma lista. Após isto, calcule a média semestral
 * das temperaturas e mostre todas as temperatura acima desta média, e em 
 * que mês elas ocorreram(mostrar o mês por extenso: 1-Janeiro, 2-Fevereiro
 * e etc).
 */
import java.util.*;

public class TemperaturaMedia {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        Double temperaturaDigitada = 0d;

        System.out.println("Digite a temperatura de Janeiro: ");
        temperaturaDigitada = scan.nextDouble();
        temperaturas.add(0, temperaturaDigitada);

        System.out.println("Digite a temperatura de Fevereiro: ");
        temperaturaDigitada = scan.nextDouble();
        temperaturas.add(1, temperaturaDigitada);

        System.out.println("Digite a temperatura de Março: ");
        temperaturaDigitada = scan.nextDouble();
        temperaturas.add(2, temperaturaDigitada);

        System.out.println("Digite a temperatura de Abril: ");
        temperaturaDigitada = scan.nextDouble();
        temperaturas.add(3, temperaturaDigitada);

        System.out.println("Digite a temperatura de Maio: ");
        temperaturaDigitada = scan.nextDouble();
        temperaturas.add(4, temperaturaDigitada);

        System.out.println("Digite a temperatura de Junho: ");
        temperaturaDigitada = scan.nextDouble();
        temperaturas.add(5, temperaturaDigitada);

        Double media = 0d;

        for (Double Temperatura:temperaturas){
            media += Temperatura;
        }
        media = media / temperaturas.size();
        System.out.println("Média: " + media);

        for (int i = 0; i < temperaturas.size(); i++){
            if(temperaturas.get(i) > media){
                if(i == 0){
                    System.out.println("Janeiro: " + temperaturas.get(i));
                }
                if(i == 1){
                    System.out.println("Fevereiro: " + temperaturas.get(i));
                }
                if(i == 2){
                    System.out.println("Março: " + temperaturas.get(i));
                }
                if(i == 3){
                    System.out.println("Abril: " + temperaturas.get(i));
                }
                if(i == 4){
                    System.out.println("Junho: " + temperaturas.get(i));
                }
                if(i == 5){
                    System.out.println("Julho: " + temperaturas.get(i));
                }

            }
        }
        
        scan.close();
   
    }
    
}
