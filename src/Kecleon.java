import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Kecleon extends Pokemon {
    String name;
    int level;
    double[] base;
    public Kecleon (String name, int level) {
        this.base = new double[Stat.values().length];
        this.name = name;
        this.level = level;

    }
}
   // int HP, int ATTACK, int DEFENSE, int SPEED, int SPECIAL_ATTACK, int SPECIAL_DEFENSE