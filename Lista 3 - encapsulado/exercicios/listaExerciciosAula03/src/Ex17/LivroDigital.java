package Ex17;

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false;
    }

    public void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println("Livro digital '" + titulo + "' está aberto.");
        } else {
            System.out.println("Livro digital já está aberto.");
        }
    }

    public void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println("Livro digital '" + titulo + "' está fechado.");
        } else {
            System.out.println("Livro digital já está fechado.");
        }
    }
}

