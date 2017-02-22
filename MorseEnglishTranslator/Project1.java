public class Project1
{


    public static void main(String [] args)                                //main method to run MorseConverter class
    {
        MorseConverter p = new MorseConverter();
        int conv = Input.getInt("If you wish to convert from Morse code to English, press 1. If you wish to convert from English to Morse Code, press 2");     //prompts user for type of conversion
        if(conv == 1)
        {
            String mors = Input.getString("Enter your Morse code sequence, please separate each letter with a space and each word with a | symbol");
            String [] words = mors.split(" ");                                    //String method used to split string into array of strings given a string to separate with(in this case a space)
            for(int i=0; i < words.length; i++)
            {
                String english = p.lookUpMorse(words[i]);
                System.out.print(english);                                //prints out on 1 line
            }

        }

        else if(conv == 2)
        {
            String eng = Input.getString("Enter the English phrase you wish to translate to Morse");
            for(int c=0; c < eng.length(); c++)
            {
                char char1 = eng.charAt(c);                        //receives character at given index
                String morse = p.lookUpChar(char1);

                System.out.print(morse + " ");                     //will print space after every letter
            }

        }

        else
        {
            System.out.println("Invalid Input");
        }
    }


}

