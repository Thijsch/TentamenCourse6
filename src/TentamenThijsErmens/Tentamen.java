package TentamenThijsErmens;

import java.util.Arrays;

public class Tentamen {
    static String[][][][] array = new String[][][][];
    static String woord = "";
    static String s;
    static String bestand = "/home/termens/IdeaProjects/Tentamen Course 6/src/testdocument";
    static String human1 = "/home/termens/IdeaProjects/Tentamen Course 6/src/TentamenThijsErmens/4428.23andme.3034";
    static String testhuman = "/home/termens/IdeaProjects/Tentamen Course 6/src/TentamenThijsErmens/testhuman";
    static String human2 = "/home/termens/IdeaProjects/Tentamen Course 6/src/TentamenThijsErmens/9313.23andme.7630";
    static int arraynumber = 0;

    public static void main(String[] args) {
        read_file();
        read_human();
    }

    public static void read_file() {
        s = ReadFile.readfunctie(bestand);
        testhuman = ReadFile.readfunctie(testhuman);
        human1 = ReadFile.readfunctie(human1);
        human2 = ReadFile.readfunctie(human2);
//        System.out.print(human1);

    }

    public static void read_human() {
        for (int i = 0; i < testhuman.length(); i++) {
            char letter = testhuman.charAt(i);
            if (testhuman.charAt(i) != '\t') {
                woord += letter;
//                array[arraynumber] += testhuman.charAt(i);
            } else if (testhuman.charAt(i) == '\t') {
//                System.out.println(woord);
                array[arraynumber] += woord;
                woord = "";
                arraynumber += 1;
                if (arraynumber == 4)
                    arraynumber = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
