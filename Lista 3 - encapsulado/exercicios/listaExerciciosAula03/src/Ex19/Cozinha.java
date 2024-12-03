package Ex19;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("Cozinha está cozinhando para " + quantidadePessoas + " pessoas.");
    }

    public void limpar() {
        System.out.println("Cozinha está sendo limpa.");
    }
}

