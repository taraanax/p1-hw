
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test07 {

    private static final List<Character> SAMOGLASNIKI = List.of('A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) {
        izpisi(Cetrta.vsi(supZnaki(), c -> true), 13);
        izpisi(Cetrta.vsi(supZnaki(), c -> SAMOGLASNIKI.contains(c)), 5);

        izpisi(Cetrta.vsi(supNizi(), s -> s.length() == 5), 3);
        izpisi(Cetrta.vsi(supNizi(), s -> s.compareTo("preseren") > 0), 4);
    }

    private static <T> void izpisi(Supplier<T> sup, int koliko) {
        System.out.println(Stream.generate(sup).limit(koliko).toList());
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
