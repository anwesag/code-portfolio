public class Tortoise
{
    public int move()         //this method returns the move Tortoise makes, and its added to the Tortoise's position
    {
        int prob = (int) (Math.random()*9 + 1.0);      //random number between 1 and 10
        if(prob <= 5)
        {
            return 3;                              //Fast plod 3 units forward
        }
        else if(prob <= 8)
        {
            return 1;                                 //Slow plod 1 unit forward
        }
        else{
            return -6;                               //Slip 6 units back
        }
    }
}

