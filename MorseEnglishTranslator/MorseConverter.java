public class MorseConverter
{
    private String [][] Conversion = new String[][]{{"A", ".-"},
	                                  {"B", "-..."},
                                      {"C", "-.-."},
                                      {"D", "-.."},
                                      {"E", "."},
                                      {"F", "..-."},
                                      {"G", "--."},
                                      {"H", "...."},
                                      {"I", ".."},
                                      {"J", ".---"},
                                      {"K", "-.-"},
                                      {"L", ".-.."},
                                      {"M", "--"},
                                      {"N", "-."},
                                      {"O", "---"},
                                      {"P", ".--."},
                                      {"Q", "--.-"},
                                      {"R", ".-."},
                                      {"S", "..."},
                                      {"T", "-"},
                                      {"U", "..-"},
                                      {"V", "...-"},
                                      {"W", ".--"},
                                      {"X", "-..-"},
                                      {"Y", "-.--"},
                                      {"Z", "--.."},
                                      {"1", ".---"},
                                      {"2", "..---"},
                                      {"3", "...--"},
                                      {"4", "....-"},
                                      {"5", "....."},
                                      {"6", "-...."},
                                      {"7", "--..."},
                                      {"8", "---.."},
                                      {"9", "----."},
                                      {"0", "-----"},
                                      {" ", "|"}};             //takes care of the spaces in English and the | in Morse


    public  String lookUpChar(char nchar) //Takes character in English and converts to Morse code
    {
        for(int i=0; i < Conversion.length; i++)
        {
            if(Conversion[i][0].equals((""+ nchar).toUpperCase()))   //turns nchar into an uppercase string
            {
                return Conversion[i][1];
            }
        }

        return null;
    }

    public  String lookUpMorse(String nmors)//Takes Morse code letter and converts it to English letter
    {
        for(int i=0; i < Conversion.length; i++)
        {
            if(Conversion[i][1].equals(nmors))
            {
                return Conversion[i][0];
            }
        }

        return null;
    }
}
