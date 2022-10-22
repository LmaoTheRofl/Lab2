package Moves;

import ru.ifmo.se.pokemon.*;

public class RestHitmontop extends StatusMove{
    public  RestHitmontop(){

        super(Type.PSYCHIC, 0.0, 0.0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect = (new Effect()).condition(Status.SLEEP).turns(2);
        p.setCondition(effect);
        p.setStats(50.0, p.getStat(Stat.ATTACK),
                p.getStat(Stat.DEFENSE),
                p.getStat(Stat.SPECIAL_ATTACK),
                p.getStat(Stat.SPECIAL_DEFENSE),
                p.getStat(Stat.SPEED));
    }
    @Override
    protected String describe(){

        return "использует RestHitmontop";
    }
}
