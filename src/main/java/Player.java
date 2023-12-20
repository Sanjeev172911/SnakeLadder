import java.util.Random;

public class Player {
    int position;
    int moves;
    public Player(){
        position=0;
        moves=0;
    }

    public boolean isWinner(){
        return this.position==100;
    }

    public int RollDice(){
        Random random=new Random();
        return random.nextInt(6)+1;
    }


    public void makeMove(Player p){
        double draw=Math.random();
        int diceVal=RollDice();
        if(draw==.4) return;
        else if(draw<.4){
            p.position=Math.max(0,p.position-diceVal);
        }else{
            if(p.position+diceVal<=100){
                p.position+=diceVal;
                makeMove(p);
            }
        }
    }

    public void singlePlayerPlay(){
        while(!isWinner()){
            this.moves++;
            makeMove(this);
            System.out.println("position of Player1 after "+this.moves+" is "+this.position);
        }
    }

    public void TwoPlayerPlay(Player p2){
        int turn=0;
        while(!this.isWinner() && !p2.isWinner()){
            if(turn%2==0){
                this.moves++;
                makeMove(this);
                System.out.println("position of Player1 after "+this.moves+" is "+this.position);
            }else{
                p2.moves++;
                makeMove(p2);
                System.out.println("position of Player2 after "+p2.moves+" is "+p2.position);
            }
            turn++;
        }

        if(this.isWinner()) System.out.println("Player1 is the winner");
        else System.out.println("Player2 is the winner");
    }
    
}
