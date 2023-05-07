package Parte01;


public class Carro {
    
    String cor = "Branco";
    String modelo = "Argo";

     int tanqueGasolina = 47;
     double valorGasolina = 0;
     Carro(){
        
     }

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

    public double encherTanque(double valorGasolina){
        double valorTotal = 0;
        int tanqueGasolina = 47;
        valorTotal = valorGasolina * tanqueGasolina;
        return valorTotal;
    }
    public double encherTanque(double valorGasolina, int restoDoTanque){
        double valorTotal = 0;
        valorTotal = valorGasolina * tanqueGasolina;
        return valorTotal;
    }

    public static void main(String[] args) {
        
    }
}
