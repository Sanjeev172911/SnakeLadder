public class Player {
    int position;
    int moves;
    public Player(){
        position=0;
        moves=0;
    }

    public boolean isWinner(){
        return position==100;
    }
    
}
