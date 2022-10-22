package Pokemons;

import Moves.Psychic;
import Moves.Scald;
import Moves.WaterGun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Pokemon {

    public Poliwhirl(String name, int level) {
        super(name, level);
        setStats(65.0, 65.0, 65.0, 50.0, 50.0, 90.0);
        setType(Type.WATER);
        setMove(new Scald(), new Psychic(), new WaterGun());
    }
}

