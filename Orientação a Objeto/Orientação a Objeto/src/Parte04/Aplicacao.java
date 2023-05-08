package Parte04;

public class Aplicacao {
    public static void main(String[] args) {
        //Criamos um vetor da ClasseMae com os objetos CalsseFilha1, ClasseFilha2 e ClasseMae
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for(ClasseMae classe: classes){ //for each, que passa em cada objeto do vetor "classes"
            classe.metodo01(); // Ocorre Polimorfismo porque o metodo01, presente em todos os 3 objetos, possui comportamento diferente de acordo com cada objeto
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
