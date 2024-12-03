package Ex4;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456", 1000.00);
        conta.depositar(500.00);
        conta.sacar(200.00);
    }
}
