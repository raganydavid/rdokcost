/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refactored by: Ragány Dávid Gergő, 2024-02-26
 */

// FileWriter import
import java.io.FileWriter;
import java.io.IOException;
// PrintWriter import
import java.io.PrintWriter;

public class Filehandler {
    
    //  A writeToFile() metódus kiírja a kapott költségeket fájlba.
    public void writeToFile(Koltseg k) {
        
        //Próba, hogy lefut-e.
        try {
            PrintWriter printwr = new PrintWriter(new FileWriter("adat.txt", true));
            
            printwr.write(k.szallitas.toString());
            printwr.write(":");
            printwr.write(k.uzlet.toString());
            printwr.write(":");
            printwr.write(k.javitas.toString());
            printwr.write("\n");
            printwr.close();

            System.out.println("Költségek kiírása a fájlba sikeresen megtörtént.");

        } catch (IOException e) {

            System.err.println("A fájl kiírása közben hiba lépett fel.");

        }

    }

}
