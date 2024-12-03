package Ex10;

public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Preto");
        veiculo.abastecer();
        veiculo.lavar();
    }
}

