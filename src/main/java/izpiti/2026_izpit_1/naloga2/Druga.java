
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01: primer iz besedila
02--06: dolžina izhodnega niza je enaka dolžini vhodnega niza
01, 07--10: splošni primeri
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char p = sc.next().charAt(0);
        char q = sc.next().charAt(0);
        String S = sc.next();
        int n = sc.nextInt();

        char[] niz = S.toCharArray();

        for (int i = 0; i < n; i++) {
            int k = niz.length - 1;

            while (k >= 0 && niz[k] == q) {
                niz[k] = p;
                k--;
            }

            if (k >= 0) {
                niz[k]++;
            } else {
                niz = new char[niz.length + 1];
                Arrays.fill(niz, p);
            }
        }

        System.out.println(new String(niz));
    }
}


    // pomo"zne metode, notranji razredi (po potrebi) ...

