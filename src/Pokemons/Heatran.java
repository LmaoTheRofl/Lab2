package Pokemons;

import Moves.DoubleTeam;
import Moves.FireBlast;
import Moves.RockTomb;
import Moves.ScaryFace;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Heatran extends Pokemon {

    public Heatran(String name, int level) {
        super(name, level);
        setStats(91.0, 90.0, 106.0, 130.0, 106.0, 77.0);
        setType(Type.FIRE, Type.STEEL);
        setMove(new FireBlast(), new ScaryFace(), new RockTomb(), new DoubleTeam());
    }
}
