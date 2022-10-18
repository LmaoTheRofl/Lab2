import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Politoed extends Pokemon {

    public Politoed(String name, int level) {
        super(name, level);
        setStats(90.0, 75.0, 75.0, 90.0, 100.0, 70.0);
        setType(Type.WATER);
        setMove(new Scald(), new Psychic(), new WaterGun(), new DoubleTeam());
    }
}

