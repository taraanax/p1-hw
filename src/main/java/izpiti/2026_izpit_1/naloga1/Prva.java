
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--06: ustaviti se moramo na vsaki "crpalki (razen na zadnji)
01, 07--10: splošni primeri
01, 02: ro"cno izdelana
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int p = sc.nextInt();

        int tempk = k;
        int gorivo = 0;
        int postanki = 0;

        while (sc.hasNextInt()) {
        int d = sc.nextInt();

        if (tempk < d) {
            gorivo += k - tempk;
            tempk = k;
            postanki++;
        }

        tempk -= d;
        }



        System.out.println(postanki);
        System.out.println(gorivo);

    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
