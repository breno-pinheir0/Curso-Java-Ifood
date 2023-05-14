import java.util.*;

/*
 * Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
 * modelo = gol - consumo = 14,4km/l
 * modelo = uno - consumo = 15,6km/l
 * modelo = mobi - consumo = 16,1km/l
 * modelo = hb20 - consumo = 14,5km/l
 * modelo = kwid - consumo = 15,6km/l
 */
public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{ //HashMap não salva a ordem de inserção
            put("gol", 14.4); // para adicionar um valor, devemos usar o put
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);
        System.out.println();

        System.out.println("Substitua o consumo do Gol por 15,2km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println();

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println();

        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("uno")); // retorna o valor ao colocar a chave
        System.out.println();

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); // o comando keySet() possui retorno do tipo Set
        System.out.println(modelos);
        System.out.println();

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values(); // retorna uma Collection
        System.out.println(consumos);
        System.out.println();    

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); // pedimos o maior valor da coleção de valores
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.print(modeloMaisEficiente + " - " + consumoMaisEficiente);
        System.out.println();

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values()); // pedimos o menor valor da coleção de valores
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
            }
        }
        System.out.print(modeloMenosEficiente + " - " + consumoMenosEficiente);
        System.out.println();

        
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println();

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
        System.out.println();

        System.out.println("Remova os modelos com consumo igual a 15,6km/l");
        
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);
        System.out.println();

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{ //HashMap não salva a ordem de inserção
            put("gol", 14.4); // para adicionar um valor, devemos usar o put
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);
        System.out.println();



    }
}
