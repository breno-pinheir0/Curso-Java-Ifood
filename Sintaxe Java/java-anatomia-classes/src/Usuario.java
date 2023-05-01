public class Usuario {
    public static void main(String [] args) throws Exception{
        SmarTV smartTv = new SmarTV();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        
        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.mudarCanal(25);
    }
}
