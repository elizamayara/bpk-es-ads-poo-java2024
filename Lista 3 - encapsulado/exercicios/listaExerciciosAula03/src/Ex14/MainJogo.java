package Ex14;

public class MainJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Witcher", "RPG", 150.00);
        jogo.iniciar();
        jogo.pausar();
    }
}
