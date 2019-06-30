public class BuildDeath {

    public static void buildDeath(String[][] omulet,int c){

        switch (c){
            case 1:
                omulet[0][1] = "o";
                break;
            case 2:
                omulet[1][1] = "|";
                break;
            case 3:
                omulet[1][0] = "/";
                break;
            case 4:
                omulet[1][2] = "\\";
                break;
            case 5:
                omulet[2][0] = "/";
                break;
            case 6:
                omulet[2][2] = "\\";
                break;
        }

    }


}
