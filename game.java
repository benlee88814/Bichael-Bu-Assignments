import javax.sound.midi.SysexMessage;
import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class game {
    public static void main(String args[]) throws InterruptedException, IllegalArgumentException
    {
        String player;
        String[] bank = new String[]{"Rock", "Paper", "Scissors"};
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("Rock, Paper, or Scissors? ");
            player = scan.next();
            if(checkAnswer(player))
            {
                throw new IllegalArgumentException("You didn't play rock, paper, or scissors.");
            }
            for(int i = 0; i < 3; i++)
            {
                System.out.println(bank[i]);
                Thread.sleep(1000);
            }
            int code = translate(player);
            int dis = generate();
            winCondition(code, dis);
            System.out.println("You played " + player);
            Thread.sleep(3000);
            System.out.println("Do you want to play again? (Y or N)");
            String con = scan.next();
            if (con.equalsIgnoreCase("N"))
            {
                System.out.println("Good Game!");
                break;
            }
        }
    }
    public static int generate()
    {
        int answer = (int)(Math.random() * 2);
        return answer;
    }
    public static boolean checkAnswer(String play)
    {
        if(play.equalsIgnoreCase("rock"))
        {
            return false;
        }
        if(play.equalsIgnoreCase("paper"))
        {
            return false;
        }
        if(play.equalsIgnoreCase("Scissors"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static int translate(String play)
    {
        if(play.equalsIgnoreCase("rock"))
        {
            return 0;
        }
        else if(play.equalsIgnoreCase("Paper"))
        {
            return 1;
        }
        else if(play.equalsIgnoreCase("Scissors"))
        {
            return 2;
        }
        return 0;
    }
    public static void winCondition(int play, int comp) {
        switch (play) {
            case 0: {
                switch (comp) {
                    case 0: {
                        System.out.println("Tie!");
                        break;
                    }
                    case 1: {
                        System.out.println("You lose!");
                        break;
                    }
                    case 2: {
                        System.out.println("You win!");
                        break;
                    }
                }
                break;
            }
            case 1: {
                switch (comp) {
                    case 0: {
                        System.out.println("You win!");
                        break;
                    }
                    case 1: {
                        System.out.println("Tie!");
                        break;
                    }
                    case 2: {
                        System.out.println("You Lose!");
                        break;
                    }
                }
                break;
            }
            case 2:
                switch (comp) {
                    case 0: {
                        System.out.println("You lose!");
                        break;
                    }
                    case 1: {
                        System.out.println("You win!");
                        break;
                    }
                    case 2: {
                        System.out.println("Tie!");
                        break;
                    }
                }
                break;
        }
    }
}
