import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrogue extends Pokemon {

    public Tyrogue(String name, int level) {
        super(name, level);
        setStats(35.0, 35.0, 35.0, 35.0, 35.0, 35.0);
        setType(Type.FIGHTING);
        setMove(new LowSweep(), new RestTyrogue(), new Confide());
    }
}
