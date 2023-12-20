public class Main {
    public static void main(String[] args) {
        Player player1=new Player();
        Board gameBoard=new Board();

        System.out.println("Player1 Rolling the dice");
        System.out.println(gameBoard.RollDice());
    }
}
