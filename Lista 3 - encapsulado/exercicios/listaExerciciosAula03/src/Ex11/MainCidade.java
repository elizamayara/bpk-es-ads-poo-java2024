package Ex11;

public class MainCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");
        cidade.aumentarPopulacao(10000);
        cidade.diminuirPopulacao(5000);
    }
}

