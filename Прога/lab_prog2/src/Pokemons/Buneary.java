
package Pokemons;
import Moves.special.ShadowBall;
import Moves.physical.QuickAttack;
import Moves.status.Rest;
import ru.ifmo.se.pokemon.*;


public class Buneary extends Pokemon{
    public Buneary(String var1, int var2) {
        super(var1, var2);
        this.setType(Type.NORMAL);
        this.setStats(55.0, 66.0, 44.0, 44.0, 56.0, 85.0);
        this.setMove(new ShadowBall(), new QuickAttack(), new Rest());

    }
}
