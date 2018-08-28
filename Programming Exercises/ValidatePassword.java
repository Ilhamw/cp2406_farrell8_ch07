import java.util.*;
public class ValidatePassword
{
    public static void main(String[] args)
    {
        System.out.println("Enter a password with at least two uppercase letters, two lowercase letters, and two digits");
        String password = null;
        int passLenght = password.length();
        Scanner input = new Scanner(System.in);
        password = input.nextLine();
        final int MIN = 2;
        int upper = 0;
        int lower = 0;
        int digit = 0;
        
        
        for (int i = 0; i < passLenght; ++i)
        {
            
            char c = password.charAt(i);
            if (Character.isLowerCase(c))
            {
                lower++;
            }else
                if (Character.isUpperCase(c))
                {
                    upper++;
                }else
                    if (Character.isDigit(c))
                    {
                        digit++;
                    }
        }

        if (upper >= MIN && lower >= MIN && digit >= MIN)
        {
            System.out.println("Valid password");
        }else
        {
            System.out.println("The password did not have enough of the following:");
            if(upper < MIN)
                System.out.println("uppercase letters");
            if(lower < MIN)
                System.out.println("lowercase letters");
            if(digit < MIN)
                System.out.println("digits");
        }

    }
}
