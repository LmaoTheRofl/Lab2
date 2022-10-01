import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kecleon extends Pokemon {

    public Kecleon (String name, int level) {
        super(name, level);
        setStats(60.0, 90.0, 70.0, 60.0, 120.0, 40.0);
        setType(Type.NORMAL);
        //addMove();
    }
}
   // int HP, int ATTACK, int DEFENSE, int SPEED, int SPECIAL_ATTACK, int SPECIAL_DEFENSE