import ru.ifmo.se.pokemon.*;

public class WaterGun extends SpecialMove{
    public WaterGun(){

        super(Type.WATER, 40.0, 1.00);
    }

    @Override
    protected String describe(){

        return "использует WaterGun";
    }
}

