import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Lab2 {
    public static void main(String[] args) {

    Battle b = new Battle();
    Heatran p1 = new Heatran("Чужой", 1);
    Pokemon p2 = new Pokemon("Хищник", 1);
        System.out.println(p1.getStat(Stat.HP));
b.addAlly(p1);
b.addFoe(p2);
b.go();


}}
