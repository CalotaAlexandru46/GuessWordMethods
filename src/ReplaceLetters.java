public class ReplaceLetters {


    public static String Replace(String input){
        String str=input;
        String toGuess = str.replaceAll("[a-zA-Z]", "-");
        return toGuess;
    }
}
