package Ex21;

public class MainCozinha {
    public static void main(String[] args) {
        Cozinha minhaCozinha = new Cozinha("Gourmet", 4, "Azul");

        minhaCozinha.cozinhar();
        minhaCozinha.limpar();
    }
}

