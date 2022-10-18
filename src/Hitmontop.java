import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hitmontop extends Pokemon {

    public Hitmontop(String name, int level) {
        super(name, level);
        setStats(50.0, 95.0, 95.0, 35.0, 110.0, 70.0);
        setType(Type.FIGHTING);
        setMove(new LowSweep(), new RestHitmontop(), new Confide(), new StoneEdge());
    }
}

