import java.util.Random;

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

    public int RollDice(){
        Random random=new Random();
        return random.nextInt(6)+1;
    }


    public void makeMove(){
        double draw=Math.random();
        int diceVal=RollDice();
        if(draw==.4) return;
        else if(draw<.4){
            this.position=Math.max(0,this.position-diceVal);
        }else{
            if(this.position+diceVal<=100) this.position+=diceVal;
        }
    }

    public void singlePlayerPlay(){
        while(!isWinner()){
            this.moves++;
            makeMove();
        }
    }
    
}
