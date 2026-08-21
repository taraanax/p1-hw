
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test02 {

    private static final List<Character> SAMOGLASNIKI = List.of('A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) {
        System.out.println(Cetrta.kti(supZnaki(), c -> true, 4));
        System.out.println(Cetrta.kti(supZnaki(), c -> SAMOGLASNIKI.contains(c), 5));

        System.out.println(Cetrta.kti(supNizi(), s -> s.length() == 5, 1));
        System.out.println(Cetrta.kti(supNizi(), s -> s.compareTo("preseren") > 0, 3));
    }

    private static Supplier<Character> supZnaki() {
        Iterator<Character> it = List.of(
            'P', 'R', 'O', 'G', 'R', 'A', 'M', 'I', 'R', 'A', 'N', 'J', 'E'
        ).iterator();

        return () -> it.next();
    }

    private static Supplier<String> supNizi() {
        Iterator<String> it = List.of(
                "o", "vrba", "srecna", "draga", "vas", "domaca",
                "kjer", "hisa", "mojega", "stoji", "oceta"
        ).iterator();

        return () -> it.next();
    }
}
