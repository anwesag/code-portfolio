public class Hare
{

    public int move()            //This method returns the move for the hare and adds it to the hare's position
    {
        int prob = (int) (Math.random()*9 + 1.0);   //random number between 1-10

        if(prob <= 2)
        {
            return 9;                          //Big hop 9 units forward
        }
        else if(prob <= 5)
        {
            return 1;                    //Small hop 1 unit forward
        }
        else if (prob == 6)
        {
            return -12;                   //Big slip 12 units back
        }
        else if (prob <= 8)
        {
            return -2;                //Small slip 2 units back
        }
        else
        {
            return 0;            //Hare falling asleep, staying in place
        }
    }
}
