public class Main {
    public static void main(String[] args) {
        Player player1=new Player();
        Board gameBoard=new Board();

        System.out.println("Player1 Rolling the dice");
        System.out.println(gameBoard.RollDice());
        player1.singlePlayerPlay();
        System.out.println("Total number of moves taken by Player1 to reach 100 is "+player1.moves);
    }
}
