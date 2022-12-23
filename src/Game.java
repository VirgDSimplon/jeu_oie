public class Game {
    private String [] boardGame = new String[64];

    private String [] boardPosition = new String[64];

    public void initBoard(){
        for ( int i = 0; i <= 63; ++i){
            if (i < 10){
                this.boardGame[i] = i + "  ";
            }else{
                this.boardGame[i] = i + " ";
            }
            System.out.print(boardGame[i]);
        }
        System.out.println("");
    }
    public void setBoardPosition(int position){
        for ( int i = 0; i <= 63; ++i){
            if (i==position){
                this.boardPosition[i] = "X |";
            }else{
                this.boardPosition[i] = "  |";
            }
            System.out.print(boardPosition[i]);
        }
    }

    //initialiser le(s) joueur(s)

    //lancer de dés

    //définir positionnemnet (avec calcul des coups spéciaux)
}
