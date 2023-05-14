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