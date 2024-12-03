package Ex7;

public class MainAluno {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.0};
        Aluno aluno = new Aluno("João", "2023001", "Engenharia", notas);
        System.out.println("Média das notas: " + aluno.calcularMediaNotas());
    }
}

