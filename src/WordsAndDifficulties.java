import java.util.Random;
import java.util.Scanner;

public class WordsAndDifficulties {

    public static String Words(){

        Scanner input=new Scanner(System.in);

        String[] avansat={"rotopercutor","cibernetica",""};
        String[] mediu={"motocicleta","telefon","plastilina","pompier","dislocat"};
        String[] incepator = {"apa", "mere", "pere", "cal", "elev", "peste", "pisica"};
        String diff;
        String str="";
        System.out.println("Alege intre urmatoarele dificultati: incepator, mediu, avansat.");
        do{
            diff=input.nextLine();
        }while(!(diff.equalsIgnoreCase("incepator") || diff.equalsIgnoreCase("mediu")
                || diff.equalsIgnoreCase("avansat")));


        if(diff.equalsIgnoreCase("incepator")){
            int x = new Random().nextInt(incepator.length);
            str=incepator[x];
        }

        if(diff.equalsIgnoreCase("mediu")){
            int x= new Random().nextInt(mediu.length);
            str=mediu[x];
        }

        if(diff.equalsIgnoreCase("avansat")){
            int x=new Random().nextInt(avansat.length);
            str=avansat[x];
        }
        return str;
    }

}
