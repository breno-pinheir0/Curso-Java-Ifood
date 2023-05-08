package Parte03;

public class Aplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //Upcasts:
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast(Não devemos trabalhar com downcast):
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
