
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test01 {

    public static void main(String[] args) {
        System.out.println(Cetrta.kti(supSeznam(), n -> n % 2 == 1, 3));
        System.out.println(Cetrta.kti(supSeznam(), n -> n >= 10, 1));

        System.out.println(Cetrta.kti(supLiho(), n -> n % 7 == 0, 5));
        System.out.println(Cetrta.kti(supLiho(), n -> n > 100, 10));

        System.out.println(Cetrta.kti(supFib(), n -> n % 4 == 0, 6));
        System.out.println(Cetrta.kti(supFib(), n -> n > 50, 3));
    }

    private static Supplier<Integer> supSeznam() {
        Iterator<Integer> it = List.of(1, 3, 6, 7, 10, 9, 8, 14, 7, 16, 15).iterator();
        return () -> it.next();
    }

    // 1, 3, 5, 7, ...
    private static Supplier<Integer> supLiho() {
        return new Supplier<>() {
            int n = -1;

            @Override
            public Integer get() {
                return this.n += 2;
            }
        };
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    private static Supplier<Integer> supFib() {
        return new Supplier<>() {
            int pp = 0;
            int p = 1;

            @Override
            public Integer get() {
                int vrni = this.pp;
                int n = this.pp + this.p;
                this.pp = this.p;
                this.p = n;
                return vrni;
            }
        };
    }

}
