public class Main
{
    public static void main(String[] args)
    {


    }

    public static String translateWords(String input)
    {
        return input;
    }

    public static String translateWord(String input)
    {
        int position = -5;


        for(int i = 0; i < input.length(); i++)
        {
            if(isVowel(input.charAt(i)))
            {
                position = i;
                break;
            }
        }

        if(position == 0)
        {
            return input + "way";
        }

    }

    public static boolean isVowel(char letter)
    {
        Character.toLowerCase(letter);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y')
            {
                return true;
            }

            else
                return false;
    }
}
