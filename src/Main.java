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
        while (!game.gameOver(player1)){
            int sum = throwDice();
            int newPosition = player1.getPosition()+sum;
            while (game.isSpecialBox(newPosition)){
                if (game.isGooseBox(newPosition)){
                    newPosition = newPosition + sum;
                    System.out.println("Tu es tombé sur une case oie");
                }
                if (newPosition>game.getBoardSize()){
                    int advanceMax = 63 - player1.getPosition();
                    int retreat = sum - advanceMax;
                    newPosition = 63 - retreat;
                }
            }

            player1.setPosition(newPosition);
            game.initBoard();
            game.setBoardPosition(player1.getPosition());
        }
        System.out.println("Bravo, tu as gagné");
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
    public static int throwDice(){
        Game game = new Game();
        int dice1 = game.getRandomDice();
        int dice2 = game.getRandomDice();
        int sumDice = dice1 + dice2;
        System.out.println("dés 1 : " + dice1);
        System.out.println("dés 2 : " + dice2);
        return sumDice;
    }
}
