// Create a Word class with one static method called showLetters
public class Word
{
    public static String showLetters(String word, String guess)
    {
        char [] a = new char[word.length()];
        for(int i = 0; i < word.length(); i++)  
        {
            a[i] = word.charAt(i);
        }
        
        char [] c = new char[guess.length()];
        for(int i = 0; i < guess.length(); i++)     
        {
            c[i] = guess.charAt(i);
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
            for(int j = 0; j < c.length; j++)       
            {
                if(a[i] == c[j])                    
                {
                    b[i] = a[i];                    
                }
            }
        }

        String s = new String(b);                   
        return s;                                   
    }
}