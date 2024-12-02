package Pokemons;


import Moves.status.Rest;
import Moves.status.DefenseCurl;
import ru.ifmo.se.pokemon.*;

public class Igglybuff extends Pokemon{
    public Igglybuff(String var1, int var2){
        super(var1, var2);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(90, 30, 15, 40, 20, 15);
        this.setMove(new Rest(), new DefenseCurl());
    }
}
