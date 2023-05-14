import java.util.*;
/*
 * Dadas as seguintes informações sobre meus livro favoritos e seus autores,
 * crie um dicionário e ordene este dicionário exibindo:
 * (Nome autor - Nome Livro);
 * 
 * Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo - Páginas: 256
 * Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito - Páginas: 408
 * Autor = Harari, Yuval Noah - Livro = 21 Lições para o Século 21 - Páginas: 432
 */

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem Aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{ // hashmap para ordem aleatória
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro:meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println();

        System.out.println("--\tOrdem de Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{ // hashmap para ordem aleatória
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro:meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println();



    }
    
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }

    public Integer getPaginas(){
        return paginas;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString(){
        return  "Livro{" +
                "nome ='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}