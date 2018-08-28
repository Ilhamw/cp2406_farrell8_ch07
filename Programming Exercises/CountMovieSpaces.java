public class CountMovieSpaces 
{
    public static void main(String[] args)
    {
        String quote = "Let go of the past, and keep moving forward";
        System.out.println(quote);
        int space = 0;
        int stringLenght = quote.length();
        for (int i = 0; i < stringLenght; ++i)
        {
            if (quote.charAt(i) == ' ')
            {
                ++space;
            }
        }

        System.out.println("There are " + space + " spaces");

    }
}
