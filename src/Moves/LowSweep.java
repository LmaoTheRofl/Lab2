package Moves;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove{
    public LowSweep(){
        super(Type.FIGHTING, 65.0, 100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){
        return "использует LowSweep";
    }
}
