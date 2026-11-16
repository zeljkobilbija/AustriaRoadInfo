package com.zeljkobilbija001.austriaroadinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Spisak autoputeva po zemljama (DE, FR, IT – JSON-i iz AutobahnInfo, AutoroutesInfo i AutostradeInfo; NL, BE, LU). Novi autoput: dodaj JSON u assets/autoputevi
 * (node alati/benelux_skripta.js NL-A2) i upiši ime datoteke umesto null ("autoputevi/nl-a2.json").
 * Za Belgiju se u nazivu rute navodi i evropska oznaka (E40), jer je na tablama češća od A-broja.
 */
public final class Autoputevi {

    private Autoputevi() { }

    public static final List<Autoput> SVE = Arrays.asList(
            new Autoput("AT", "A1", "Wien – Linz – Salzburg", "autoputevi/at-a1.json"),
            new Autoput("AT", "A2", "Wien – Graz – Klagenfurt – Villach", "autoputevi/at-a2.json"),
            new Autoput("AT", "A3", "Wien – Eisenstadt", "autoputevi/at-a3.json"),
            new Autoput("AT", "A4", "Wien – Flughafen – Nickelsdorf", "autoputevi/at-a4.json"),
            new Autoput("AT", "A5", "Wien – Poysdorf", "autoputevi/at-a5.json"),
            new Autoput("AT", "A6", "Bruckneudorf – Kittsee", "autoputevi/at-a6.json"),
            new Autoput("AT", "A7", "Linz – Unterweitersdorf", "autoputevi/at-a7.json"),
            new Autoput("AT", "A8", "Wels – Ried – Suben", "autoputevi/at-a8.json"),
            new Autoput("AT", "A9", "Sattledt – Graz – Spielfeld", "autoputevi/at-a9.json"),
            new Autoput("AT", "A10", "Salzburg – Villach", "autoputevi/at-a10.json"),
            new Autoput("AT", "A11", "Villach – Karawankentunnel", "autoputevi/at-a11.json"),
            new Autoput("AT", "A12", "Kufstein – Innsbruck – Landeck", "autoputevi/at-a12.json"),
            new Autoput("AT", "A13", "Innsbruck – Brenner", "autoputevi/at-a13.json"),
            new Autoput("AT", "A14", "Hörbranz – Bregenz – Bludenz", "autoputevi/at-a14.json"),
            new Autoput("AT", "A21", "Wiener Außenring: Steinhäusl – Vösendorf", "autoputevi/at-a21.json"),
            new Autoput("AT", "A22", "Wien – Stockerau", "autoputevi/at-a22.json"),
            new Autoput("AT", "A23", "Südosttangente Wien", "autoputevi/at-a23.json"),
            new Autoput("AT", "A25", "Linz – Wels", "autoputevi/at-a25.json"),
            new Autoput("AT", "S1", "Wiener Außenring Schnellstraße", "autoputevi/at-s1.json"),
            new Autoput("AT", "S2", "Wiener Nordrand Schnellstraße", "autoputevi/at-s2.json"),
            new Autoput("AT", "S5", "Stockerau – Krems", "autoputevi/at-s5.json"),
            new Autoput("AT", "S6", "Semmering Schnellstraße (Seebenstein – St. Michael)", "autoputevi/at-s6.json"),
            new Autoput("AT", "S10", "Mühlviertler Schnellstraße (Linz – Freistadt)", "autoputevi/at-s10.json"),
            new Autoput("AT", "S31", "Burgenland Schnellstraße (Eisenstadt)", "autoputevi/at-s31.json"),
            new Autoput("AT", "S33", "Kremser Schnellstraße (St. Pölten – Traismauer)", "autoputevi/at-s33.json"),
            new Autoput("AT", "S35", "Brucker Schnellstraße (Bruck – Graz)", "autoputevi/at-s35.json"),
            new Autoput("AT", "S36", "Murtal Schnellstraße (St. Michael – Judenburg)", "autoputevi/at-s36.json"),
            new Autoput("AT", "S3", "Weinviertler Schnellstraße (Stockerau – Guntersdorf)", "autoputevi/at-s3.json"),
            new Autoput("AT", "S4", "Mattersburger Schnellstraße", "autoputevi/at-s4.json"),
            new Autoput("AT", "S7", "Fürstenfelder Schnellstraße", "autoputevi/at-s7.json"),
            new Autoput("AT", "S16", "Arlberg Schnellstraße (Landeck – St. Anton)", "autoputevi/at-s16.json"),
            new Autoput("AT", "S37", "Klagenfurter Schnellstraße (St. Veit – Klagenfurt)", "autoputevi/at-s37.json")
    );

    /** Redosled zemalja na početnom ekranu. */
    public static final String[] ZEMLJE = {"AT"};

    /** Autoputevi jedne zemlje ("NL", "BE" ili "LU"), redom kao u spisku. */
    public static List<Autoput> zaZemlju(String zemlja) {
        List<Autoput> l = new ArrayList<>();
        for (Autoput a : SVE) if (a.zemlja.equals(zemlja)) l.add(a);
        return l;
    }

    public static Autoput poId(String id) {
        for (Autoput a : SVE) if (a.id.equals(id)) return a;
        return null;
    }
}
