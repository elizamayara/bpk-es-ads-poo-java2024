package Ex11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int incremento) {
        populacao += incremento;
        System.out.println("População de " + nome + " aumentada para " + populacao + ".");
    }

    public void diminuirPopulacao(int decremento) {
        if (decremento <= populacao) {
            populacao -= decremento;
            System.out.println("População de " + nome + " diminuída para " + populacao + ".");
        } else {
            System.out.println("Decremento maior que a população atual.");
        }
    }
}

