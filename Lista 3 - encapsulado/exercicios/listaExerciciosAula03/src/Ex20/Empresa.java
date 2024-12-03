package Ex20;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar() {
        numeroFuncionarios++;
        System.out.println("Número de funcionários da empresa " + nome + " aumentado para " + numeroFuncionarios + ".");
    }

    public void demitir() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Número de funcionários da empresa " + nome + " diminuído para " + numeroFuncionarios + ".");
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
}

