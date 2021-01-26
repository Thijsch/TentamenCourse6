/**
 * @author Thijs Ermens
 * @date 26-11-2020
 * @function Het inlezen van een bestand en de inhouod returnen
 */
package TentamenThijsErmens;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static String readfunctie(String bestand) {
        /**
         * Functie die een bestand als String binnenkrijgt en vervolgens een String met de inhoud
         * returned
         *
         * return inhoud.toString() = String = inhoud bestand
         */
        StringBuilder inhoud = new StringBuilder();
        try {
            String line;
            BufferedReader inFile = new BufferedReader(new FileReader(bestand));
            while ((line = inFile.readLine()) != null) {
                inhoud.append(line).append("\n");
            }
            inFile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Bestand niet gevonden");
        } catch (IOException ioe) {
            System.out.println("Kan niet lezen in bestand");
        } catch (Exception e) {
            System.out.println("Onbekende fout: raadpleeg uw systeembeheerder");
        }
        return inhoud.toString();
    }
}