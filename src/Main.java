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
        int position = -1;
        int upperCasePosition = -1;
        boolean hasUpperCase = false;
        boolean containsPunctuationMark = false;


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

        if(isNotCharacter(input.charAt(input.length())))
        {
            containsPunctuationMark = true;
        }





        if(position == 0)
        {
            return input + "way";
        }


        if (hasUpperCase)
        {
            char[] c = input.toCharArray();
            Character.toUpperCase(c[upperCasePosition]);
            Character.toLowerCase(c[0]);
            input = c.toString();
        }

        if(containsPunctuationMark)
        {

        }


        String a = input.substring(position);
        String b = input.substring(0, position);

        return a + b + "ay";

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

    public static boolean isNotCharacter(char letter)
    {
        if(Character.isLetter(letter))
        {
            return false;
        }

        else
        {
            return true;
        }
    }
}
