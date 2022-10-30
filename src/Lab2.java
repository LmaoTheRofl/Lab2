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

        Random random = new Random();
        int randomCount = (random.nextInt(4) + 2) * 2;
        System.out.println(randomCount);
        Battle b = new Battle();
        AtomicReference<Integer> addedToAlly = new AtomicReference<>(0);
        AtomicReference<Integer> addedToFoe = new AtomicReference<>(0);
        IntStream.range(0, randomCount)
                .mapToObj(i -> getRandomPokemon())
                .collect(Collectors.toList())
                .forEach(p -> {
                    if (Math.random() > 0.5) {
                        if (addedToAlly.get() >= randomCount / 2) {
                            b.addFoe(p);
                            System.out.println(p + " to foe");
                        } else {
                            addedToAlly.getAndSet(addedToAlly.get() + 1);
                            b.addAlly(p);
                            System.out.println(p + " to ally");
                        }
                    } else {
                        if (addedToFoe.get() >= randomCount / 2) {
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

    private static String getRandomName() {
        return Arrays.asList("Эдвард", "Кархтавый", "Никитка", "Гоша", "Петька", "Семён").get((int) (Math.random() * 5));
    }

    private static Pokemon getRandomPokemon() {
        return Arrays.asList(
                new Heatran(getRandomName(), 1),
                new Tyrogue(getRandomName(), 1),
                new Hitmontop(getRandomName(), 1),
                new Poliwag(getRandomName(), 1),
                new Poliwhirl(getRandomName(), 1),
                new Politoed(getRandomName(), 1)
        ).get((int) (Math.random() * 5));
    }
}
