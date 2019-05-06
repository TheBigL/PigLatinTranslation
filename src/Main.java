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
        int upperCasePosition = 0;
        boolean hasUpperCase = false;


        for(int i = 0; i < input.length(); i++)
        {
            if(isUpperCase(input.charAt(i)))
            {
                hasUpperCase = true;
                upperCasePosition = i;

            }

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

        if(hasUpperCase == true)
        {

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

    public static boolean isUpperCase(char letter)
    {
        if(Character.isUpperCase(letter))
        {
            return true;
        }

        else
            return false;
    }
}
