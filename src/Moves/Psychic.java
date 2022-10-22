package Moves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove{
    public Psychic(){

        super(Type.PSYCHIC, 90.0, 100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.10) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }}
    @Override
    protected String describe(){

        return "использует Psychic";
    }
}

