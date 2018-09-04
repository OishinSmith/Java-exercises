public class WordScore
{
    int score;
    String word; //constructors etc
    public WordScore(String string)
    {
        word = string;
        
    }
    public int score(String line)
    {
        String [] splitLine = line.split(" ");
        int sLLength = splitLine.length;
        for(int i = 0;i<sLLength;i++)
        {
            if(splitLine[i].matches(word))
            {
                return Integer.parseInt(line.substring(1,2));
            }
        }
        return -1;
    }
}