public class SmarTV {
    
    boolean ligada = false;
    int canal = 1, volume = 15;
    
    public void ligar(){
        ligada = true;
        System.out.println("Agora, a TV está ligada? " + ligada);
    }

    public void desligar(){
        ligada = false;
        System.out.println("Agora, a TV está ligada? " + ligada);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Agora, o volume atual é: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Agora, o volume atual é: " + volume);
    }

    public void mudarCanal(int canal){
        this.canal  = canal;
        System.out.println("Agora, o canal atual é: " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Agora, o canal atual é: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Agora, o canal atual é: " + canal);
    }
}
