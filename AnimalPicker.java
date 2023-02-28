import java.util.Scanner;

public class AnimalPicker
{
    public static void main(String[] args)
    {
        System.out.println("Please chose either a cat or dog:");

        Scanner input = new Scanner(System.in);
        String animal = input.nextLine();

        if (animal.equalsIgnoreCase("Cat"))
        {
            System.out.println("CAT ASCII ART HERE");
        }
        else if (animal.equalsIgnoreCase("Dog"))
        {
            System.out.println("DOG ASCII ART HERE");
        }
    }
}