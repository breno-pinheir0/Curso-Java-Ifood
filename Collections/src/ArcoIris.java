import java.util.*;
/*
 * Crie um conjunto contendo as cores do arco-íris e:
 * A. Exiba todas as cores uma abaixo da outra
 * B. Exiba a quantidade de cores que o arco-íris tem
 * C. Exiba as cores em ordem alfabética
 * D. Exiba as cores na ordem inversa da que foi informada
 * E. Exiba todas as cores que começam com a letra "v"
 * F. Remova todas as cores que não começam com a letra "v"
 * G. Limpe o conjunto
 * H. Confira se o conjunto está vazio
 */
public class ArcoIris {
    public static void main(String[] args) {
        Set<String> cores = new LinkedHashSet<>();
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Violeta");
        Iterator<String> iterator = cores.iterator(); 
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            
        }
        System.out.println();
        
        System.out.println("Quantidade de cores: " + cores.size());
        System.out.println();

        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);
        System.out.println();

        Iterator<String> iterator2 = cores.iterator();
        while(iterator2.hasNext()){
            String next = iterator2.next();
            if(next.charAt(0) == 'V'){
                
                System.out.println(next);
            } 
        }
        System.out.println();
        for(String cores3:cores){
            if(cores3.startsWith("A") || cores3.startsWith("L")){
                cores2.remove(cores3);
            }
        }
        System.out.println(cores2);
        System.out.println();
        
        cores2.clear();

        System.out.println("O conjunto está vazio: " + cores2.isEmpty());

    }
    

}
