import java.util.Scanner;

public class AnimalPicker
{
    public static void main(String[] args)
    {
        System.out.println("Please chose either a cat, dog, or fish:");

        Scanner input = new Scanner(System.in);
        boolean error = false;

        do
        {
            String animal = input.nextLine();
            if (animal.equalsIgnoreCase("Cat"))
            {
                System.out.println("        __..--\'\'``---....___   _..._    __\n /// //_.-\'    .-/\";  `        ``<._  ``.\'\'_ `. / // /\n///_.-\' _..--.\'_    \\                    `( ) ) // //\n/ (_..-\' // (< _     ;_..__               ; `\' / ///\n / // // //  `-._,_)\' // / ``--...____..-\' /// / //\n");
                error = true;
            }
            else if (animal.equalsIgnoreCase("Dog"))
            {
                System.out.println("                              .-.\n     (___________________________()6 `-,\n     (   ______________________   /\'\'\"`\n     //\\\\                      //\\\\\njgs  \"\" \"\"     ");
                error = true;
            }
            else if (animal.equalsIgnoreCase("Fish"))
            {
                System.out.println("\n _________         .    .\n(..       \\_    ,  |\\  /|\n \\       O  \\  /|  \\ \\/ /\n  \\______    \\/ |   \\  / \n     vvvv\\    \\ |   /  |\n     \\^^^^  ==   \\_/   |\n      `\\_   ===    \\.  |\n      / /\\_   \\ /      |\n      |/   \\_  \\|      /\n snd         \\________/");
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