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
        System.out.print(Collections.max(carrosPopulares.values())); // pedimos o maior valor da coleção de valores


    }
}
