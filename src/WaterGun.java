import ru.ifmo.se.pokemon.*;

public class WaterGun extends SpecialMove{
    public WaterGun(){

        super(Type.WATER, 40.0, 100.0);
    }

    @Override
    protected String describe(){

        return "использует WaterGun";
    }
}

