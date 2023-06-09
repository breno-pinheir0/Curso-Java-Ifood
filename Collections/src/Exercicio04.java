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
            add(new LinguagemFavorita("Python", 2002, "VSCode"));
            add(new LinguagemFavorita("HTML", 2006, "Notepad++"));
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

        System.out.println();
        System.out.println("---\t Ordem Ano de Criação/Nome\t---");
        Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        linguagem4.addAll(linguagem);
        for(LinguagemFavorita Linguagem : linguagem4) System.out.println(Linguagem.getNome() + " - " + Linguagem.getAnoDeCriacao() + " - " + Linguagem.getIde());

        System.out.println();
        System.out.println("---\t Ordem Nome/Ano de Criação/IDE\t---");
        Set<LinguagemFavorita> linguagem5 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIDE());
        linguagem5.addAll(linguagem);
        for(LinguagemFavorita Linguagem : linguagem5) System.out.println(Linguagem.getNome() + " - " + Linguagem.getAnoDeCriacao() + " - " + Linguagem.getIde());
    
    
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

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){

        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;

        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIDE implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2){

        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;

        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;

        return l1.getIde().compareTo(l2.getIde());
    }
}
