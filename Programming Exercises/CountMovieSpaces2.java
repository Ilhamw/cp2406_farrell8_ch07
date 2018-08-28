import java.util.*;
public class CountMovieSpaces2
{
    public static void main(String[] args)
    {
        System.out.println("Enter a movie quote ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
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
