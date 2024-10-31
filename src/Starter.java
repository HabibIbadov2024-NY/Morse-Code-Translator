import java.util.Locale;
import java.util.Scanner;

public class Starter{
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Can you write a text for translating: ");
        String texttext = userInput.nextLine().toLowerCase();



        Translator translator = new Translator();
        String textCode = translator.totextMachen(texttext);
        System.out.println(textCode);




    }

}

