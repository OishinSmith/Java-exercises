// Create a Word class with one static method called showLetter
public class Word
{
    public static String showLetter(String word, char guess)
    {
        char [] a = new char[word.length()];
        for(int i = 0; i < word.length(); i++)
        {
            a[i] = word.charAt(i);
        }
        
        String underScore = "_";
        char underscore = underScore.charAt(0);
        
        char [] b = new char[a.length];
        for(int i = 0; i < b.length; i++)
        {
            b[i] = underscore;
        }
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == guess)
            {
                b[i] = a[i];
            }
        }

        String s = new String(b);
        return s;
    }
}