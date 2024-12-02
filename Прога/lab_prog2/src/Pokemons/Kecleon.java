
package Pokemons;

import Moves.special.Psybeam;
import Moves.status.Rest;
import Moves.special.Thunderbolt;
import Moves.status.Confide;
import ru.ifmo.se.pokemon.*;

public class Kecleon extends Pokemon{
    public Kecleon(String var1, int var2){
        super(var1, var2);

        this.setType(Type.NORMAL);
        this.setStats(60.0, 90.0, 70.0, 60.0, 120.0, 40.0);
        this.setMove(new Psybeam(), new Rest(), new Thunderbolt(), new Confide());
    }
}
