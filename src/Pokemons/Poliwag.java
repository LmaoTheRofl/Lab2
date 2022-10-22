package Pokemons;

import Moves.Psychic;
import Moves.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {

    public Poliwag(String name, int level) {
        super(name, level);
        setStats(40.0, 50.0, 40.0, 40.0, 40.0, 90.0);
        setType(Type.WATER);
        setMove(new Scald(), new Psychic());
    }
}

