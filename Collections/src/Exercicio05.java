import java.util.*;
/*
 * Dada a população estimada de alguns estados do NE brasileiro, faça:
 * Estado = PE - População = 9616621
 * Estado = AL - População = 3351543
 * Estado = CE - População = 9187103
 * Estado = RN - População = 3534265
 * - Crie um dicionário e relacione os estados e suas populações;
 * - Substitua a população do estado do RN por 3534165
 * - Confira se o estado de PB está no dicionário. Caso não, adicione: PB - 4039277
 * - Exiba a população de PE;
 * - Exiba todos os estados e suas populações e suas populações na ordem que foi informado;
 * - Exiba os estados e suas populações em ordem alfabética;
 * - Exiba os estados com a menor população e sua quantidade;
 * - Exiba o estado com a maior população e sua quantidade;
 * - Exiba a soma da população desses estados;
 * - Exiba a média da população deste dicionário de estados;
 * - Remova os estados com a população menor que 4000000;
 * - Apague o dicionário de estados;
 * - Verifique se o dicionário está vazio;
 */

public class Exercicio05 {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{ 
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados.toString());
        System.out.println();

        System.out.println("Substitua a população do estado do RN por 3534165: ");
        estados.put("RN", 3534165);
        System.out.println(estados);
        System.out.println();

        System.out.println("Confira se o estado de PB está no dicionário. Caso não, adicione: PB - 4039277: ");
        estados.put("PB", 4039277);
        System.out.println();

        System.out.println("Exiba a população de PE: ");    
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String pe = "PE";
        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getKey().equals(pe)){
                System.out.println(entry.getValue());
            }
        }
        System.out.println();

        Map<String, Integer> estados1 = new LinkedHashMap<>(){{ 
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estados1.toString());
        System.out.println();

        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> estados2 = new TreeMap<>(estados1); //TreeMap salva a ordem de acordo com a chave (String)
        System.out.println(estados2);
        System.out.println();

        
        Integer  menorPopulacao = Collections.min(estados1.values()); // pedimos o maior valor da coleção de valores
        String estadoMenorPopulacao = "";
        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();
            }
        }
        System.out.println("Exiba os estados com a menor população e sua quantidade: " + estadoMenorPopulacao);
        System.out.println();
    
        
        Integer maiorPopulacao = Collections.max(estados1.values()); // pedimos o maior valor da coleção de valores
        String  estadoMaiorPopulacao = "";
        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
            }
        }
        System.out.println("Exiba os estados com a maior população e sua quantidade: " + estadoMaiorPopulacao);
        System.out.println();

        Integer soma = 0;
        for(Map.Entry<String, Integer> entry: entries){
            soma += entry.getValue();
            
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);
        System.out.println();

        System.out.println("Exiba a média da população desses estados: " + (soma/estados1.size()));
        System.out.println();

        Iterator<Integer> iterator1 = estados1.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next()  < 4000000){
                iterator1.remove();
            }
        }
        System.out.println("Remova os estados com a população menor que 4000000: " + estados1);
        System.out.println();

        System.out.println("Apague o dicionário de estados");
        estados1.clear();
        System.out.println();

        System.out.println("Verifique se o dicionário está vazio: " + estados1.isEmpty());
        System.out.println();
    }
    
}

class Estado{
    private String nome;
    private Integer populacao;

    public Estado(String nome, Integer populacao){
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome(){
        return nome;
    }

    public Integer getPopulacao(){
        return populacao;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return nome.equals(estado.nome) && populacao.equals(estado.populacao);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, populacao);
    }

    @Override
    public String toString(){
        return  "Estado{" +
                "nome = '" + nome + '\'' +
                ", populacao = " + populacao +
                '}';
    }
}