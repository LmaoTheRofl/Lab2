import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Lab2 {
    public static void main(String[] args) {

    Battle b = new Battle();
    Heatran p1 = new Heatran("Эдвард", 1);
    Tyrogue p2 = new Tyrogue("Кархтавый", 1);
    Hitmontop p3 = new Hitmontop("Гоша", 1);
    Poliwag p4 = new Poliwag("Семён", 1);
    Poliwhirl p5 = new Poliwhirl("Никитка", 1);
    Politoed p6 = new Politoed("Петя", 1);
b.addAlly(p1);
b.addAlly(p3);
b.addAlly(p5);
b.addFoe(p2);
b.addFoe(p4);
b.addFoe(p6);
b.go();


}}
