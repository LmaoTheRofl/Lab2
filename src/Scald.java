import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove{
    public Scald(){

        super(Type.WATER, 80.0, 100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.30) {
            if(!p.hasType(Type.FIRE)) {
                Effect effect = (new Effect()).condition(Status.BURN);
                p.setCondition(effect);
            }}}
    @Override
    protected String describe(){

        return "использует Scald";
    }
}
