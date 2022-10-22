package Moves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove{
    public StoneEdge(){

        super(Type.ROCK, 100.0, 80.0);
    }
    @Override
    protected double calcCriticalHit(Pokemon p1, Pokemon p2){
        if( (p1.getStat(Stat.SPEED) * 3.0)/512 > Math.random()){
            return 2.0;
        }
        return 1.0;
    }
    @Override
    protected String describe(){

        return "использует StoneEdge";
    }
}

