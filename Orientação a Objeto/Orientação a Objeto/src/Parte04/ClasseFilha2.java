package Parte04;

public class ClasseFilha2 extends ClasseMae {
    @Override //@Override serve para sobrescrever um método
    void metodo01(){
        System.out.println("Método 01 da Classe Filha 2!");
    }

    @Override //@Override serve para sobrescrever um método
    void metodo02(){
        System.out.println("Método 02 da Classe Filha 2!");
    }
}
