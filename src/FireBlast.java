import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove{
    public FireBlast(){

        super(Type.FIRE, 110.0, 85.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.10) {
            Effect effect = (new Effect()).condition(Status.BURN);
            p.setCondition(effect);
    }}
    @Override
    protected String describe(){

        return "использует FireBlast";
    }
}
