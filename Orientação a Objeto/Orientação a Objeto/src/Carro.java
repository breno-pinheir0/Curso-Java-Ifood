import java.util.Scanner;

public class Carro {
    
    String cor = "Branco";
    String modelo = "Argo";

    static int tanqueGasolina = 47;
    static double valorGasolina = 0;

    Carro(String cor, String modelo, int tanqueGasolina){
        this.cor = cor;
        this.modelo = modelo;
        this.tanqueGasolina = tanqueGasolina;
    }
    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
     void setTanqueGasolina(int tanqueGasolina){
        this.tanqueGasolina = tanqueGasolina;
    }
    int getTanqueGasolina(){
        return tanqueGasolina;
    }


 
    
    public static double encherTanque(double valorGasolina){
        double valorTotal = 0;
        int tanqueGasolina = 47;
        valorTotal = valorGasolina * tanqueGasolina;
        return valorTotal;
    }
    public static double encherTanque(double valorGasolina, int restoDoTanque){
        double valorTotal = 0;
        valorTotal = valorGasolina * tanqueGasolina;
        return valorTotal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da gasolina: ");
        valorGasolina = scan.nextDouble();
        System.out.println("O tanque está cheio? [S para sim e N para não] ");
        char resposta = scan.next().charAt(0);
        if(resposta == 'S' || resposta == 's'){
            double valorAPagar = encherTanque(valorGasolina);
            System.out.println("Valor a pagar: R$" + valorAPagar);
        }
        if(resposta == 'N' || resposta == 'n'){
            System.out.println("Digite quantos litros faltam para encher o tanque: " );
            tanqueGasolina = scan.nextInt();
            double valorAPagar = encherTanque(valorGasolina, tanqueGasolina);
            System.out.println("Valor a pagar: R$" + valorAPagar);

        }
        scan.close();
    }
}
