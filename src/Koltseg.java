/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refactored by: Ragány Dávid Gergő, 2024-02-26
 */

public class Koltseg {
    Double szallitas;
    Double uzlet;
    Double javitas;

    public Koltseg(String szallitas, String uzlet, String javitas) {
        this.szallitas = Double.parseDouble(szallitas);
        this.uzlet = Double.parseDouble(uzlet);
        this.javitas = Double.parseDouble(javitas);
    }
    
}
