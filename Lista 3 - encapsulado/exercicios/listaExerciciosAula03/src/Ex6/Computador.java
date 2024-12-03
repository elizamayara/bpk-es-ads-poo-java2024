package Ex6;

public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private boolean ligado;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Computador está ligado.");
        } else {
            System.out.println("Computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Computador está desligado.");
        } else {
            System.out.println("Computador já está desligado.");
        }
    }
}

