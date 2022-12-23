public class Main {
    public static void main(String[] args) {
        //commencer le jeu
        Game game = new Game();
        game.initBoard();
        //lancer les dés
        //tester si combinaison speciale
        game.setBoardPosition(63);
        //continuer le jeu jusqu'à ce qu'on arrive en 63
    }
}
