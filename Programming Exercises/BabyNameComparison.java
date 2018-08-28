import java.util.*;
public class BabyNameComparison
{
    public static void main(String[] args)
    {
        String name1;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter name 1>>> ");
        name1 = input1.nextLine();
        String name2;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter name 2>>> ");
        name2 = input2.nextLine();
        String name3;
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter name 3>>> ");
        name3 = input3.nextLine();
        System.out.println("The possible names are: ");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);



    }
}
