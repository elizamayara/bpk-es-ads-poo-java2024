package Ex15;

public class MainLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Supermercado XYZ", "Rua das Flores, 123", "1234-5678");
        loja.abrir();
        loja.fechar();
    }
}
