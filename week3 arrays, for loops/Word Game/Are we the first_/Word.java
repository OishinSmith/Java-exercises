// Create a Word class with one static method called isFirstLetter

public class Word
{
    public static boolean isFirstLetter(String word, char letter)
    {
        char firstl = word.charAt(0);
        if(firstl == letter)
        {
            return true;
        }
        return false;
    }
}