import java.util.HashMap;

public class TranslatorMorse {

    public final HashMap<String, String> toText = new HashMap<>();

    public  TranslatorMorse (){
        toText.put(".-", "a");
        toText.put("-...", "b");
        toText.put("-.-", "c");
        toText.put("-..", "d");
        toText.put(".", "e");
        toText.put("..-.", "f");
        toText.put("--.", "g");
        toText.put("....", "h");
        toText.put("..", "i");
        toText.put(".---", "j");
        toText.put("-.-", "k");
        toText.put(".-..", "l");
        toText.put("--", "m");
        toText.put("-.", "n");
        toText.put("---", "o");
        toText.put(".--.", "p");
        toText.put("--.-", "q");
        toText.put(".-.", "r");
        toText.put("...", "s");
        toText.put("-", "t");
        toText.put("..-", "u");
        toText.put("...-", "v");
        toText.put(".--", "w");
        toText.put("-..-", "x");
        toText.put("-.--", "y");
        toText.put("--..", "z");
        toText.put(".----", "1");
        toText.put("..---", "2");
        toText.put("...--", "3");
        toText.put("....-", "4");
        toText.put(".....", "5");
        toText.put("-....", "6");
        toText.put("--...", "7");
        toText.put("---..", "8");
        toText.put("----.", "9");
        toText.put("-----", "0");
        toText.put("/", " ");
    }

    public String toTextMachen(String morse){
        String textCode = "";

        for (int j=0; j<morse.length(); j++){
            char c = morse.charAt(j);
            String morseChar = toText.get(String.valueOf(c));
            textCode +=  (morseChar != null ? morseChar : "?") + " ";

        }

        return textCode.trim();
    }
}




