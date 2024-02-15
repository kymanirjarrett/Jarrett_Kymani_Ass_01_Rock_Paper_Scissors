import java.util.Scanner;

public class RPSFormat
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String playerA;

        do {

            // Lets get a R P S game move

            System.out.print("Enter your move [RPS] ");
            playerA = in.nextLine();

            if (playerA.equalsIgnoreCase("R"))
            {
                System.out.println("PlayerA chose Rock");
                done = true;
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                System.out.println("PlayerA chose paper");
                done = true;
            }
            else if (playerA.equalsIgnoreCase("S"))
            {
                System.out.println("PlayerA chose scissors");
                done = true;
            }
            else
                System.out.println("You must enter [RPS] not " + playerA);

        }while(!done);

        playerA = playerA.toUpperCase();
        switch (playerA)
        {
            case"R":
                System.out.println("PlayerA move is ROCK");
                break;
            case "P":
                System.out.println("playerA move is PAPER");
                break;
            case "S":
                System.out.println("playerA move is SCISSORS");
                break;
            default:
                System.out.println("PlayerA move is illegal: " + playerA);
        }


    }
}
