import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Main {
    public static void main(String[] args) {

    Battle b = new Battle();
    Kecleon p1 = new Kecleon("Чужой", 1);
    Pokemon p2 = new Pokemon("Хищник", 1);
    p1.setStats(60.0, 90.0, 70.0, 60.0, 120.0, 40.0);
        System.out.println(p1.getStat(Stat.HP));
b.addAlly(p1);
b.addFoe(p2);
b.go();


}}
