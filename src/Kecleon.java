import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Kecleon extends Pokemon {
    String name;
    int level;
    double[] base;
    public Kecleon (String name, int level, double HP, double Attack, double Defense, double specattack, double specdefense, double speed) {
        this.base = new double[Stat.values().length];
        this.name = name;
        this.level = level;
        this.base[Stat.HP.ordinal()] = HP;
        this.base[Stat.ATTACK.ordinal()] = Attack;
        this.base[Stat.DEFENSE.ordinal()] = Defense;
        this.base[Stat.SPECIAL_ATTACK.ordinal()] = specattack;
        this.base[Stat.SPECIAL_DEFENSE.ordinal()] = specdefense;
        this.base[Stat.SPEED.ordinal()] = speed;
    }
}
   // int HP, int ATTACK, int DEFENSE, int SPEED, int SPECIAL_ATTACK, int SPECIAL_DEFENSE