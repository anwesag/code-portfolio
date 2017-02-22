public class Race
{
    private int positionT = 1;
    private int positionH = 1;
    private int winner = -1;

    public void start()
    {
        System.out.println("And They're Off!!");

        Tortoise t = new Tortoise();                        //Tortoise and hare objects
        Hare h = new Hare();

        while (positionT < 50 && positionH < 50)
        {
            positionT = updatePosition(positionT, t.move());
            positionH = updatePosition(positionH, h.move());

            if (positionH == 50 && positionT < 50)
                winner = 0;
            else if (positionT == 50 && positionH < 50)
                winner = 1;
            else if (positionH == 50 && positionT == 50)
                winner = 2;

            printPositions(positionT, positionH);   //positions are put on board
        }

    }

    public int getWinner()
    {
        return winner;
    }

    private int updatePosition(int initPosition, int change)
    {
        int tempP = initPosition;

        tempP += change;                     //adds move to current position

        if (tempP < 1)                     //to make sure a slip doesn't bring player past the first position
           tempP = 1;
        else if (tempP > 50)               //to make sure player stops at 50th position
           tempP = 50;

        return tempP;
    }

    private void printPositions(int positionT, int positionH)
    {
        boolean ouchPosition = false;
        if (positionT == positionH && !(positionH ==1 || positionH == 50)) //will put ouch when both players are at the same position, as long as they aren't at starting or ending
            ouchPosition = true;

        for (int i = 1; i <= 50; i++) //makes board, spaces for blank spaces, lines between each space, T& H for players, and OUCH when in same location
        {
            if (ouchPosition && positionT == i)
                System.out.print("OUCH");
            else if (positionT == i)
                System.out.print("T");
            else if (positionH == i)
                System.out.print("H");
            else
                System.out.print(" ");

            System.out.print("|");
        }
        System.out.println("");

        // Print win information
        if (winner == 0)
            System.out.print("Hare wins!!");
        else if (winner == 1)
            System.out.print("Tortoise wins!!");
        else if (winner == 2)
            System.out.print("It's TIE!!");
    }
}
