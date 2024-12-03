package Pokemons;

import Moves.physical.BodySlam;
import ru.ifmo.se.pokemon.*;

public class Jigglypuff extends Igglybuff{
    public Jigglypuff(String var1, int var2){
        super(var1, var2);
        this.setStats(115, 45, 20, 45, 25, 20);
        this.setMove(new BodySlam());
    }
}
