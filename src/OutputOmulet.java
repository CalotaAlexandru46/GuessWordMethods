public class OutputOmulet {

    public static void outputOmulet(String[][] omulet){
        for (int j = 0; j < omulet.length; j++) {
            for (int k = 0; k < omulet.length; k++) {
                System.out.print(omulet[j][k]);
            }
            System.out.println();
        }
    }
}
