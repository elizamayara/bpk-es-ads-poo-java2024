package Ex3;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
    }
}

