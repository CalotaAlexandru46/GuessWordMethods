import java.util.Scanner;

public class Spanzuratoarea {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        System.out.print("Te rog introdu un nume:");
        String numeJucator = input.nextLine();
        System.out.println();
        System.out.println("Salut, " + numeJucator + "! Bine ai venit in joc!");
        System.out.println("Ghiceste cuvantul sau o sa fii spanzurat!\nAi grija, ai doar 7 incercari!\nSucces!");
        System.out.println();

        String str=WordsAndDifficulties.Words();
        boolean jocActiv=true;

        while(jocActiv) {
            String[][] o = new String[3][3];
            BuildOmulet.omuletBuilder(o);
            String toGuess=ReplaceLetters.Replace(str);
            int count=0;
            System.out.println("Introdu o litera ca sa incepem:");
            System.out.println(toGuess);
            StringBuilder sb = new StringBuilder(toGuess);
            do{
                char c = input.nextLine().charAt(0);
                boolean flag = false;
                for (int i = 0; i < str.length(); i++) {
                    if (c == str.charAt(i)) {

                        flag = true;
                        sb.setCharAt(i, c);
                    }
                }
                System.out.println("Bravo, ai ghicit litera:"+c+". Incearca o alta litera:");
                if(!flag){
                    count++;
                    BuildDeath.buildDeath(o,count);
                    if(count>6) {
                        System.out.println("Nu ati ghicit si ati fost spanzurat, cuvantul era: " + str);
                        break;
                    }
                }
                System.out.println(sb);
                OutputOmulet.outputOmulet(o);
            }while(sb.toString().contains("-"));
            System.out.println("Ati gresit de " + count + " ori.");
            System.out.println("Vrei sa mai incerci o data? Tasteaza Da sau Nu:");

            String reluareJoc= input.nextLine();
            if(reluareJoc.equalsIgnoreCase("da")) {
                System.out.println("Bine ai revenit in joc, " + numeJucator + "!");
                System.out.println("Ai grija, poti gresi doar de 7 ori pana spanzuri omul :(  Succes!");
                System.out.println();
                jocActiv = true;


            }
            else if(reluareJoc.equalsIgnoreCase("nu")){
                jocActiv=false;
                System.out.println("Ne mai jucam si data viitoare :) ");

                break;
            }

        }

    }

}
