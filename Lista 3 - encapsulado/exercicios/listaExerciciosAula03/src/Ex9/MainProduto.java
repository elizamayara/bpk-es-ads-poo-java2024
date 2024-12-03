package Ex9;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Cadeira", 150.00, 10);
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
    }
}

