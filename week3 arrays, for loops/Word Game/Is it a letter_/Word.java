// Create a Word class with one static method called containsLetter

 public class Word
 {
     public static boolean containsLetter(String word, char letter)
     {
         char [] a = new char[word.length()];
         for(int i = 0; i < word.length(); i++)
         {
            a[i] = word.charAt(i);
         }
         char currentL;
         for(int i = 0; i < a.length; i++)
         {
             currentL = a[i];
             if(currentL == letter)
             {
                 return true;
             }
         }
         return false;
     }
 }