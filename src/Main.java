import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Main {
    public static void main(String[] args) {

    Battle b = new Battle();
    Kecleon p1 = new Kecleon("Чужой", 1, 60.0D, 90, 70, 60, 120, 40);
    Pokemon p2 = new Pokemon("Хищник", 1);
        System.out.println(p1.getStat(Stat.HP));
b.addAlly(p1);
b.addFoe(p2);
b.go();


}}
