import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove{
    public RockTomb(){

        super(Type.ROCK, 65, 95.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){

        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){

        return "использует RockTomb";
    }
}
