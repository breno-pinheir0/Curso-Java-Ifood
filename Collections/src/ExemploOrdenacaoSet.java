import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for(Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}

class Serie {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio){
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome(){
        return nome;
    }
    public String getGenero(){
        return genero;
    }
    public Integer getTempoEpisodio(){
        return tempoEpisodio;
    }

    @Override
    public String toString(){
        return "{" + 
                "nome ='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio ='" + tempoEpisodio +
                "}";
    }

    @Override
    public boolean equals(Object o){
        if(this== o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, genero, tempoEpisodio);
    }
}