public class Player {
    int position;

    public Player(){
        position=0;
    }

    public boolean isWinner(){
        return position==100;
    }
    
}
