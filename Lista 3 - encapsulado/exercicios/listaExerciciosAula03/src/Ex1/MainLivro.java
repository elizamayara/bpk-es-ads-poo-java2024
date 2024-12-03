package Ex1;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("1984", "George Orwell", 328);
        livro.abrir();
        livro.lerPagina();
        livro.lerPagina();
    }
}
