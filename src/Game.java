public class Game {
    private String [] boardGame = new String[64];

    private String [] boardPositions = new String[64];

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
    public void initBoardPosition(int position){
        for ( int i = 0; i <= 63; ++i){
                if (i==position){
                    this.boardGame[i] = "X |";
                }else{
                    this.boardGame[i] = "  |";
                }

            System.out.print(boardGame[i]);
        }
    }
}
