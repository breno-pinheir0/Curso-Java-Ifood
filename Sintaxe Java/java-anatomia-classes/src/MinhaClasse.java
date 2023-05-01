public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Breno";
        String segundoNome = "Pinheiro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome); // Junta a String primeiroNome com um espaço e com o segundoNome. É o mesmo que utilizar um "+" entre a String primeiroNome e " " e a String segundoNome
    }
}
