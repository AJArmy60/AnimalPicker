import java.util.Scanner;

public class AnimalPicker
{
    public static void main(String[] args)
    {
        System.out.println("Please chose either a cat or dog:");

        Scanner input = new Scanner(System.in);
        boolean error = false;

        do
        {
            String animal = input.nextLine();
            if (animal.equalsIgnoreCase("Cat"))
            {
                System.out.println("CAT ASCII ART HERE");
                error = true;
            }
            else if (animal.equalsIgnoreCase("Dog"))
            {
                System.out.println("DOG ASCII ART HERE");
                error = true;
            }
            else
            {
                System.out.println("ERROR");
                System.out.println("Please enter a valid input:");
            }
        } while (error == false);
    }
}