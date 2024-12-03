package Ex17;

public class MainLivroDigital {
    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital("O Senhor dos Anéis", "J.R.R. Tolkien", 5.2);
        livroDigital.abrir();
        livroDigital.fechar();
    }
}

