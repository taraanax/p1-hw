
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

02--06: samo prilivi in takoj"snji odlivi
01, 07--10: vsi trije tipi transakcij
01: primer iz besedila
01, 02, 07, 08: ro"cno izdelani
*/

import java.util.*;

public class Tretja {
    
    public static abstract class Transakcija {
        private int dan;
        private int znesek;

        protected Transakcija(int dan, int znesek) {
            this.dan = dan;
            this.znesek = znesek;
        }

        public int vrniDan() {
            return this.dan;
        }

        public int vrniZnesek() {
            return this.znesek;
        }
    }

    public static class Priliv extends Transakcija {
        public Priliv(int dan, int znesek) {
            super(dan, znesek);
        }
    }

    public static class TakojsnjiOdliv extends Transakcija {
        public TakojsnjiOdliv(int dan, int znesek) {
            super(dan, znesek);
        }
    }

    public static class OdlozeniOdliv extends Transakcija {
        public OdlozeniOdliv(int dan, int znesek) {
            super(dan, znesek);
        }
    }

    public static class Racun {

        // dopolnite po potrebi ...

        public Racun(int odlog) {
            // dopolnite ...
        }

        public Integer izvedi(Transakcija transakcija) {
            // popravite / dopolnite ...
            return null;
        }

        // dopolnite po potrebi ...
    }

    // morebitni dodatni notranji razredi (po potrebi) ...
}
