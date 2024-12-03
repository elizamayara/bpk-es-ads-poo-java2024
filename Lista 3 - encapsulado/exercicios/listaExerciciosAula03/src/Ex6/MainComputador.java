package Ex6;

public class MainComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel i7", 16, 512);
        computador.ligar();
        computador.desligar();
    }
}
