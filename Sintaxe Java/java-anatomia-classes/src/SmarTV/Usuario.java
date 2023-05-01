package SmarTV;
import java.util.*;
public class Usuario {
    public static void main(String [] args) throws Exception{
        SmarTV smartTv = new SmarTV();
        Scanner scan = new Scanner(System.in);
        System.out.println("Status da TV: " + smartTv.ligada);
        System.out.println("Volume da TV: " + smartTv.volume);
        System.out.println("Canal da TV: " + smartTv.canal);

        System.out.println("Digite L para ligar a TV ou D para desligar a TV: ");
        char escolha1 = scan.next().charAt(0);
        if(escolha1 == 'L'){
            smartTv.ligar();
        }
        if(escolha1 == 'D'){
            smartTv.desligar();
        }
        if(escolha1 != 'L' && escolha1 != 'D'){
            System.out.println("Opção inválida");
        }
        String lixo = scan.nextLine();

        System.out.println("Digite A para aumentar o volume ou D para diminuir o volume: ");
        char escolha2 = scan.next().charAt(0);
        if(escolha2 == 'A'){
            smartTv.aumentarVolume();
        }
        if(escolha2 == 'D'){
            smartTv.diminuirVolume();
        }
        if(escolha2 != 'A' && escolha2 != 'D'){
            System.out.println("Opção inválida");
        }
        
        lixo = scan.nextLine();
        
        System.out.println("Digite A para aumentar o canal em 1 ou D para diminuir o canal em 1. Caso queira colocar em um canal específico, digite E: ");
        char escolha3 = scan.next().charAt(0);
        if(escolha3 == 'A'){
            smartTv.aumentarCanal();
        }
        if(escolha3 == 'D'){
            smartTv.diminuirCanal();
        }
        if(escolha3 == 'E'){
            System.out.println("Digite o canal que deseja sintonizar: ");
            int canal = scan.nextInt();
            smartTv.mudarCanal(canal);
        }
        if(escolha3 != 'A' && escolha3 != 'D' && escolha3 != 'E'){
            System.out.println("Opção inválida");
        }
        scan.close();
        
    }
}
