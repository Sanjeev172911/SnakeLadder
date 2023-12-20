import java.util.*;

public class Board {
    Map<Integer,Integer>Snake;
    Map<Integer,Integer>Ladder;

    public void createBoard(){
        int max=95;
        int min=8;
        Random random=new Random();

        for(int i=0;i<=10;i++){
            int startL=random.nextInt(max-min+1)+min;
            int endL=random.nextInt(max-startL+1)+startL;

            Ladder.put(startL,endL);

            int startS=random.nextInt(max-min+1)+min;
            int endS=random.nextInt(max-startS+1)+startS;

//            if(startL!=startS && endL!=endS && startL!=endS && endL!=startS)
            if(startL!=endS)
                Snake.put(endS,startS);
        }
    }

    public Board(){
        Snake=new HashMap<>();
        Ladder=new HashMap<>();

        createBoard();
    }

    public int RollDice(){
        Random random=new Random();
        return random.nextInt(6)+1;
    }

}
