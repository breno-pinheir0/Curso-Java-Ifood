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
                "nome ='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}