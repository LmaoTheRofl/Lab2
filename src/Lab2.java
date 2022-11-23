import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        AtomicReference<Integer> addedToAlly = new AtomicReference<>(0);
        AtomicReference<Integer> addedToFoe = new AtomicReference<>(0);
        Arrays.asList(new Heatran("Эдвард", 1), new Tyrogue("Кархтавый", 1), new Hitmontop("Никитка", 1), new Poliwag( "Гоша", 1), new Poliwhirl("Петька", 1), new Politoed("Семён", 1))
                .forEach(p -> {
                    if (Math.random() > 0.5) {
                        if (addedToAlly.get() >= 3 ) {
                            b.addFoe(p);
                            System.out.println(p + " to foe");
                        } else {
                            addedToAlly.getAndSet(addedToAlly.get() + 1);
                            b.addAlly(p);
                            System.out.println(p + " to ally");
                        }
                    } else {
                        if (addedToFoe.get() >= 3) {
                            b.addAlly(p);
                            System.out.println(p + " to ally");
                        } else {
                            b.addFoe(p);
                            System.out.println(p + " to foe");
                            addedToFoe.set(addedToFoe.get() + 1);
                        }
                    }
                });
        b.go();
    }
}
