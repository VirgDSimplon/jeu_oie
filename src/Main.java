public class Main {
    public static void main(String[] args) {
        //commencer le jeu
        Game game = new Game();
        Player player1 = new Player("X",0);
        //lancer les dés
        player1.setPosition(firstThrowDice());
        //tester si combinaison speciale
        game.initBoard();
        game.setBoardPosition(player1.getPosition());
        //continuer le jeu jusqu'à ce qu'on arrive en 63
    }
    public static int firstThrowDice(){
        Game game = new Game();
        int dice1 = game.getRandomDice();
        int dice2 = game.getRandomDice();
        int sumDice = dice1 + dice2;
        System.out.println("dés 1 : " + dice1);
        System.out.println("dés 2 : " + dice2);

        if (sumDice == 9){
            if ((dice1 == 6 || dice2 == 6)) {
                System.out.println("position : 26");
                return 26;
            }else {
                System.out.println("position : 53");
                return 53;
            }
        }else if (sumDice == 6){
            System.out.println("position : 12");
            return 12;
        }else{
            System.out.println("position : " + sumDice);
            return sumDice;
        }
    }
}
