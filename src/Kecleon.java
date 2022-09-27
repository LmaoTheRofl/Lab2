import ru.ifmo.se.pokemon.Pokemon;

public class Kecleon extends Pokemon {
    String name;
    int lvl;
    int HP;
    int ATTACK;
    int DEFENSE;
    int SPEED;
    int SPECIAL_ATTACK;
    int SPECIAL_DEFENSE;
    public Kecleon (String name, int lvl, int HP, int ATTACK, int DEFENSE, int SPEED, int SPECIAL_ATTACK, int SPECIAL_DEFENSE){
        this.name = name;
        this.lvl = lvl;
        this.HP = HP;
        this.ATTACK = ATTACK;
        this.DEFENSE = DEFENSE;
        this.SPEED = SPEED;
        this.SPECIAL_ATTACK = SPECIAL_ATTACK;
        this.SPECIAL_DEFENSE = SPECIAL_DEFENSE;
    }
}
   // int HP, int ATTACK, int DEFENSE, int SPEED, int SPECIAL_ATTACK, int SPECIAL_DEFENSE