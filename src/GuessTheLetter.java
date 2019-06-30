import java.util.Scanner;

public class GuessTheLetter {

    public static String guessTheLetter(String str, String toGuess){
        Scanner input=new Scanner(System.in);
        StringBuilder sb = new StringBuilder(toGuess);
        char c = input.nextLine().charAt(0);
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i) && c!=sb.charAt(i)) {
                System.out.println("Bravo, ai ghicit litera:"+c+". Incearca o alta litera:");
                flag = true;
                sb.setCharAt(i, c);
                toGuess=sb.toString();
            }
        }
        return toGuess ;

    }
}
