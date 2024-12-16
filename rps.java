import java.util.Random;
import java.util.Scanner;
public class rps{
    public static void main(String[] args){
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        String[] option={"rock","paper","scissors"};
        String playerchoice;
        System.out.print("enter your choice:");
        playerchoice=input.nextLine().toLowerCase();
        if(!playerchoice.equals("rock")&&!playerchoice.equals("paper")&&!playerchoice.equals("scissors")){
            System.out.println("INVALID CHOICE");
        }
        String computerchoice=option[random.nextInt(3)];
        System.out.print("computerchoice:"+computerchoice);
        if (playerchoice.equals(computerchoice)) {
            System.out.println("Game tie");
            }
        else if(playerchoice.equals("rock")&&computerchoice.equals("scissors")){
            System.out.println("YOU WIN");
            }
        else if(playerchoice.equals("paper")&&computerchoice.equals("rock")){
            System.out.println("YOU WIN");
            }
        else if(playerchoice.equals("scissors")&&computerchoice.equals("paper")){
            System.out.println("YOU WIN");
            }
        else {
            System.out.println("YOU LOSE");

        }

    }
}