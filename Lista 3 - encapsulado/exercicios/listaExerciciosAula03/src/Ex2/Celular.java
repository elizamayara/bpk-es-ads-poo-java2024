package Ex2;

public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private boolean ligado;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Celular " + modelo + " está ligado.");
        } else {
            System.out.println("Celular já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Celular " + modelo + " está desligado.");
        } else {
            System.out.println("Celular já está desligado.");
        }
    }
}

