package Parte04;

public class Aplicacao {
    public static void main(String[] args) {
        //Criamos um vetor da ClasseMae com os objetos CalsseFilha1, ClasseFilha2 e ClasseMae
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for(ClasseMae classe: classes){ //for each, que passa em cada objeto do vetor "classes"
            classe.metodo01();
        }

        System.out.println("");

        for (ClasseMae classe: classes){
            classe.metodo02();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo02();
    }
}
