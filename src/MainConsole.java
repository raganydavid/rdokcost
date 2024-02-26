/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refactored by: Ragány Dávid Gergő, 2024-02-26
 */

import java.util.Scanner;

public class MainConsole {
    
    // Szállítási költségecske tárolása a memóriában
    String szallitas = "";
    String uzlet = "";
    String javitas = "";  
    
    public MainConsole() {

        // A dísz sor kiírása
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");        
        
        // A bekérés:
        Scanner scan = new Scanner(System.in);        

        System.out.println("──────────────────────────────────────────");
        System.out.print("Szállítási költség: ");
        szallitas = scan.nextLine();

        System.out.println("──────────────────────────────────────────");
        System.out.print("Üzleti költség: ");
        uzlet = scan.nextLine();

        System.out.println("──────────────────────────────────────────");
        System.out.print("Javítási költség: ");
        javitas = scan.nextLine();

        Koltseg k = new Koltseg(szallitas, uzlet, javitas);

        Filehandler fileHandling = new Filehandler();
        fileHandling.writeToFile(k);
    }
}
