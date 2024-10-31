import java.util.HashMap;

public class Translator {

    public final HashMap<String, String> text = new HashMap<>();

        public  Translator(){
            text.put("a", ".-");
            text.put("b", "-...");
            text.put("c",  "-.-");
            text.put("d",  "-..");
            text.put("e",    ".");
            text.put("f", "..-.");
            text.put("g",  "--.");
            text.put("h", "....");
            text.put("i",   "..");
            text.put("j", ".---");
            text.put("k",   "-.");
            text.put("l", ".-..");
            text.put("m",   "--");
            text.put("n",   "-.");
            text.put("o",  "---");
            text.put("p", ".--.");
            text.put("q", "--.-");
            text.put("r", ".-.");
            text.put("s",  "...");
            text.put("t",   "-");
            text.put("u",  "..-");
            text.put("v", "...-");
            text.put("w",  ".--");
            text.put("x", "-..-");
            text.put("y", "-.--");
            text.put("z", "--..");
            text.put("1", ".----");
            text.put("2","..---");
            text.put("3", "...--");
            text.put("4", "....-");
            text.put("5", ".....");
            text.put("6", "-....");
            text.put("7", "--...");
            text.put("8", "---..");
            text.put("9", "----.");
            text.put("0", "-----");
            text.put(" ", "/");

        }

        public String totextMachen(String text){
            String textCode = "";

            for (int i=0; i<text.length(); i++){
                char c = text.charAt(i);
                String textChar = text.get(String.valueOf(c));
                textCode += (textChar != null ? textChar : "?") + " ";

            }

            return textCode.trim();
        }
}




