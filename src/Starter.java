import java.util.Scanner;

public class Starter{
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please choose a translation type (enter 'to' for Morse translation, or 'from' to translate from Morse): ");
        String translationType = userInput.nextLine().toLowerCase();

        if (translationType.equals("to")){
            System.out.println("Can you write a text for translating: ");
            String changeOnMorse = userInput.nextLine().toLowerCase();

            Translator translator = new Translator();
            String textCode = translator.toMorseTranslate(changeOnMorse);
            System.out.println(textCode);
        }
        else if (translationType.equals("from")){
            System.out.println("Can you write a text for translating: ");
            String changeOnText = userInput.nextLine();

            TranslatorMorse translator = new TranslatorMorse();
            String textCode = translator.toNormalTextTranslate(changeOnText);
            System.out.println(textCode);
        }
        else{
            System.out.println("Error");
        }
    }
}