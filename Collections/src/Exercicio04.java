import java.util.*;
/*
 * Crie uma classe LingugagemFavorita que possua os atributos
 * nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
 * 3 linguagens e faça um programa que ordene esse conjunto por:
 * A. Ordem de Inserção
 * B. Ordem Natural(nome)
 * C. IDE
 * D. Ano de criação e nome
 * E. Nome, ano de criacao e IDE
 * Ao final, exiba as linguagens no console, uma abaixo da outra.
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagem = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 2000, "IntelliJ"));
            add(new LinguagemFavorita("Python", 2006, "VSCode"));
            add(new LinguagemFavorita("HTML", 2002, "Notepad++"));
        }};
        System.out.println("---\t Ordem de Inserção\t---");
        for(LinguagemFavorita Linguagem : linguagem) System.out.println(Linguagem.getNome() + " - " + Linguagem.getAnoDeCriacao() + " - " + Linguagem.getIde());
    
        System.out.println();
        System.out.println("---\t Ordem Natural(nome)\t---");
        Set<LinguagemFavorita> linguagem2 = new TreeSet<>(linguagem);
        for(LinguagemFavorita Linguagem : linguagem2) System.out.println(Linguagem.getNome() + " - " + Linguagem.getAnoDeCriacao() + " - " + Linguagem.getIde());

        System.out.println();
        System.out.println("---\t Ordem IDE\t---");
        Set<LinguagemFavorita> linguagem3 = new TreeSet<>(new ComparatorIDE());
        linguagem3.addAll(linguagem);
        for(LinguagemFavorita Linguagem : linguagem3) System.out.println(Linguagem.getNome() + " - " + Linguagem.getAnoDeCriacao() + " - " + Linguagem.getIde());
    
    
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    String getNome(){
        return nome;
    }

    int getAnoDeCriacao(){
        return anoDeCriacao;
    }

    String getIde(){
        return ide;
    }

    @Override
    public String toString(){
        return "{" + 
                "nome ='" + nome + '\'' +
                ", anoDeCriacao='" + anoDeCriacao + '\'' +
                ", IDE ='" + ide +
                "}";
    }

    @Override
    public boolean equals(Object o){
        if(this== o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita linguagem = (LinguagemFavorita) o;
        return nome.equals(linguagem.nome) && linguagem.equals(linguagem.anoDeCriacao) && ide.equals(linguagem.ide);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem){
        int nome = this.getNome().compareTo(linguagem.getNome());
        if(nome != 0) return nome;
        return this.getNome().compareTo(linguagem.getNome());
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){

        int ide = l1.getIde().compareTo(l2.getIde());
        if(ide != 0) return ide;

        return l1.getIde().compareTo(l2.getIde());
    }
}
