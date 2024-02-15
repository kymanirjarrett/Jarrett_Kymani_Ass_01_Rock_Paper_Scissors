import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;
        boolean play = false;

        String playerA;
        String playerB;
        String playAgain;

        do // Play Again loop.
        {
            do
            {
                System.out.print("Enter a move for Player A [R, P, or S]: ");
                playerA = in.nextLine();

                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
                {
                    in.nextLine();
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You must enter a valid move");
                }
            } while (!done);

            done = false;

            do
            {
                System.out.print("Enter a move for Player B [R, P, or S]: ");
                playerB = in.nextLine();

                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                {
                    in.nextLine();
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You must enter a valid move");
                }
            } while (!done);

            playerA = playerA.toUpperCase();
            switch (playerA)
            {
                case"R":
                    System.out.println("PlayerA move is ROCK");
                    break;
                case "P":
                    System.out.println("PlayerA move is PAPER");
                    break;
                case "S":
                    System.out.println("PlayerA move is SCISSORS");
                    break;
                default:
                    System.out.println("PlayerA move is illegal: " + playerA);
            }

            playerB = playerB.toUpperCase();
            switch (playerB)
            {
                case"R":
                    System.out.println("PlayerB move is ROCK");
                    break;
                case "P":
                    System.out.println("PlayerB move is PAPER");
                    break;
                case "S":
                    System.out.println("PlayerB move is SCISSORS");
                    break;
                default:
                    System.out.println("PlayerB move is illegal: " + playerA);
            }

            if (playerA.equalsIgnoreCase("R") && (playerB.equalsIgnoreCase("S")))
            {
                System.out.println("Rock crushes Scissors, Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("R") && (playerB.equalsIgnoreCase("P")))
            {
                System.out.println("Paper covers Rock, Player B wins!");
            }
            else if (playerA.equalsIgnoreCase("R") && (playerB.equalsIgnoreCase("R")))
            {
                System.out.println("Both plays are the same, its a tie!");
            }
            else if (playerA.equalsIgnoreCase("P") && (playerB.equalsIgnoreCase("S")))
            {
                System.out.println("Scissors cut Paper, Player B wins!");
            }
            else if (playerA.equalsIgnoreCase("P") && (playerB.equalsIgnoreCase("R")))
            {
                System.out.println("Paper covers Rock, Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("P") && (playerB.equalsIgnoreCase("P")))
            {
                System.out.println("Both plays are the same, its a tie!");
            }
            else if (playerA.equalsIgnoreCase("S") && (playerB.equalsIgnoreCase("S")))
            {
                System.out.println("Both plays are the same, its a tie!");
            }
            else if (playerA.equalsIgnoreCase("S") && (playerB.equalsIgnoreCase("R")))
            {
                System.out.println("Rock crushes Scissors, Player B wins!");
            }
            else
            {
                System.out.println("Scissors cuts Paper, Player A wins!");
            }

            done = false;

            do
            {
                System.out.print("Would you like to play again? [Y or N]: ");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))
                {
                    in.nextLine();
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You must enter Y or N");
                }
            } while (!done);


            if (playAgain.equalsIgnoreCase("Y"))
            {
                System.out.println("The game is starting again!");
            }
            else
            {
                System.out.println("The game is ending.");
                play = true;
            }

        } while (!play);
    }
}