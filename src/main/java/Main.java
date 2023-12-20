public class Main {
    public static void main(String[] args) {
        Player player=new Player();
        Board gameBoard=new Board();

        System.out.println("Player1 Rolling the dice");
        System.out.println(gameBoard.RollDice());
        player.singlePlayerPlay();
        System.out.println("Total number of moves taken by Player1 to reach 100 is "+player.moves);

        Player player1=new Player();
        Player player2=new Player();
        player1.TwoPlayerPlay(player2);
    }
}
